package eta.runtime.thunk;

import eta.runtime.stg.Closure;
import eta.runtime.stg.StgContext;

public class Ap4VUpd extends UpdatableThunk {
    public Closure p1;
    public Closure p2;
    public Closure p3;
    public Closure p4;

    public Ap4VUpd(final Closure p1, final Closure p2, final Closure p3, final Closure p4) {
        super();
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public final Closure thunkEnter(StgContext context) {
        return p1.apply3V(context, p2, p3, p4);
    }

    @Override
    public final void clear() {
        this.p1 = null;
        this.p2 = null;
        this.p3 = null;
        this.p4 = null;
    }
}
