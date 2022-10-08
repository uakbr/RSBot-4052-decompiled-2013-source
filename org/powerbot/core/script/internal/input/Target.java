
package org.powerbot.core.script.internal.input;

import org.powerbot.core.script.job.Task;
import java.awt.Point;
import org.powerbot.core.script.util.Filter;
import org.powerbot.core.script.wrappers.Targetable;

class Target
{
    Targetable targetable;
    Filter<Point> filter;
    MouseCallback callback;
    Point interactPoint;
    int steps;
    
    public Target(final Targetable targetable, final Filter<Point> filter, final MouseCallback callback) {
        int a = MouseHandler.a;
        this.targetable = targetable;
        this.filter = filter;
        this.callback = callback;
        this.interactPoint = null;
        this.steps = 0;
        if (Task.a != 0) {
            MouseHandler.a = ++a;
        }
    }
}
