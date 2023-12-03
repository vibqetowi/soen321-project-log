package y3;

import gv.r;
import java.io.File;
import java.io.FilenameFilter;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class d implements FilenameFilter {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f38204a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ e f38205b;

    public /* synthetic */ d(e eVar, int i6) {
        this.f38204a = i6;
        this.f38205b = eVar;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String name) {
        int i6 = this.f38204a;
        e this$0 = this.f38205b;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "$this_run");
                kotlin.jvm.internal.i.f(name, "name");
                if (!r.J0(name, this$0.f38210b) || !gv.n.z0(name, ".tmp")) {
                    return false;
                }
                return true;
            default:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.f(name, "name");
                if (!r.J0(name, this$0.f38210b) || gv.n.z0(name, ".tmp")) {
                    return false;
                }
                return true;
        }
    }
}
