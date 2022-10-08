
package org.powerbot.core.script;

import org.powerbot.game.api.methods.input.Mouse;
import org.powerbot.core.script.job.Task;
import java.util.LinkedList;
import org.powerbot.core.script.job.TaskContainer;
import org.powerbot.core.script.job.JobListener;
import org.powerbot.core.script.job.Job;
import java.util.List;
import org.powerbot.core.script.job.Container;
import java.util.logging.Logger;
import org.powerbot.core.script.job.LoopTask;

public abstract class ActiveScript extends LoopTask implements Script
{
    public final Logger log;
    private final Container container;
    private final List<Job> startup_jobs;
    private final JobListener stop_listener;
    public static int c;
    
    public ActiveScript() {
        final int c = ActiveScript.c;
        this.log = Logger.getLogger(this.getClass().getName());
        this.container = new TaskContainer();
        this.startup_jobs = new LinkedList<Job>();
        this.stop_listener = new JobListener() {
            @Override
            public void jobStarted(final Job job) {
            }
            
            @Override
            public void jobStopped(final Job job) {
                try {
                    if (job.equals(ActiveScript.this)) {
                        ActiveScript.this.shutdown();
                    }
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
            }
        };
        if (c != 0) {
            int a = Task.a;
            Task.a = ++a;
        }
    }
    
    @Override
    public final List<Job> getStartupJobs() {
        return this.startup_jobs;
    }
    
    @Override
    public final void start() {
        final int c = ActiveScript.c;
        ActiveScript activeScript = null;
        Label_0029: {
            Label_0028: {
                try {
                    activeScript = this;
                    if (c != 0) {
                        break Label_0029;
                    }
                    final Container container = this.container;
                    final boolean b = container.isShutdown();
                    if (b) {
                        return;
                    }
                    break Label_0028;
                }
                catch (RuntimeException ex) {
                    throw ex;
                }
                try {
                    final Container container = this.container;
                    final boolean b = container.isShutdown();
                    if (b) {
                        return;
                    }
                }
                catch (RuntimeException ex2) {
                    throw ex2;
                }
            }
            activeScript = this;
        }
        final List<Job> startupJobs = activeScript.getStartupJobs();
        int n2 = 0;
        Label_0098: {
            Label_0052: {
                int n;
                try {
                    n = (n2 = (startupJobs.contains(this) ? 1 : 0));
                    if (c != 0) {
                        break Label_0098;
                    }
                    if (n == 0) {
                        break Label_0052;
                    }
                    break Label_0052;
                }
                catch (RuntimeException ex3) {
                    throw ex3;
                }
                try {
                    if (n == 0) {
                        startupJobs.add(new Task() {
                            @Override
                            public void execute() {
                                Mouse.setSpeed(Mouse.Speed.NORMAL);
                                ActiveScript.this.onStart();
                            }
                        });
                        startupJobs.add(this);
                    }
                }
                catch (RuntimeException ex4) {
                    throw ex4;
                }
            }
            this.container.addListener(this.stop_listener);
            n2 = startupJobs.size();
        }
        final Job[] array = new Job[n2];
        startupJobs.toArray(array);
        Job[] array2 = array;
        int n3 = array2.length;
        int i = 0;
    Label_0166:
        while (true) {
            while (i < n3) {
                final Job job = array2[i];
                try {
                    this.container.submit(job);
                    ++i;
                    if (c != 0) {
                        break Label_0166;
                    }
                    if (c == 0) {
                        continue;
                    }
                }
                catch (RuntimeException ex5) {
                    throw ex5;
                }
                break;
                int j = 0;
                while (j < n3) {
                    final Job job2 = array2[j];
                    Label_0212: {
                        Label_0197: {
                            try {
                                if (c != 0) {
                                    break Label_0212;
                                }
                                final ActiveScript activeScript2 = (ActiveScript)job2;
                                final ActiveScript activeScript3 = this;
                                if (activeScript2 != activeScript3) {
                                    break Label_0197;
                                }
                                break Label_0197;
                            }
                            catch (RuntimeException ex6) {
                                throw ex6;
                            }
                            try {
                                final ActiveScript activeScript2 = (ActiveScript)job2;
                                final ActiveScript activeScript3 = this;
                                if (activeScript2 != activeScript3) {
                                    job2.join();
                                }
                            }
                            catch (RuntimeException ex7) {
                                throw ex7;
                            }
                        }
                        ++j;
                    }
                    if (c != 0) {
                        break;
                    }
                }
                return;
            }
            array2 = array;
            n3 = array2.length;
            continue Label_0166;
        }
    }
    
    @Override
    public final boolean isActive() {
        int c = ActiveScript.c;
        boolean terminated = false;
        Label_0029: {
            Label_0028: {
                Label_0025: {
                    try {
                        terminated = this.container.isTerminated();
                        if (c != 0) {
                            break Label_0025;
                        }
                        if (terminated) {
                            break Label_0028;
                        }
                    }
                    catch (RuntimeException ex) {
                        throw ex;
                    }
                }
                break Label_0029;
            }
            try {
                if (Task.a != 0) {
                    ActiveScript.c = ++c;
                }
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        return terminated;
    }
    
    @Override
    public final boolean isPaused() {
        return this.container.isPaused();
    }
    
    @Override
    public final void setPaused(final boolean paused) {
        this.container.setPaused(paused);
    }
    
    @Override
    public final void shutdown() {
        ActiveScript activeScript = null;
        Label_0017: {
            try {
                activeScript = this;
                if (ActiveScript.c != 0) {
                    break Label_0017;
                }
                final boolean b = this.isShutdown();
                if (!b) {
                    break Label_0017;
                }
                return;
            }
            catch (RuntimeException ex) {
                throw ex;
            }
            try {
                final boolean b = this.isShutdown();
                if (b) {
                    return;
                }
                this.container.submit(new Task() {
                    @Override
                    public void execute() {
                        ActiveScript.this.onStop();
                    }
                });
                activeScript = this;
            }
            catch (RuntimeException ex2) {
                throw ex2;
            }
        }
        activeScript.container.shutdown();
    }
    
    @Override
    public final boolean isShutdown() {
        return this.container.isShutdown();
    }
    
    @Override
    public final void stop() {
        this.container.interrupt();
    }
    
    @Override
    public final Container getContainer() {
        return this.container;
    }
    
    public void onStart() {
    }
    
    public void onStop() {
    }
}
