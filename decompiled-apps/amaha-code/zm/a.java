package zm;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.theinnerhour.b2b.components.libraryExperiment.model.LibraryCollection;
import is.u;
import ss.t;
import zm.b;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f39605u = 1;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ b.a f39606v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ b f39607w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ int f39608x;

    /* renamed from: y  reason: collision with root package name */
    public final /* synthetic */ LibraryCollection f39609y;

    public /* synthetic */ a(b.a aVar, b bVar, int i6, LibraryCollection libraryCollection) {
        this.f39606v = aVar;
        this.f39607w = bVar;
        this.f39608x = i6;
        this.f39609y = libraryCollection;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        boolean z10;
        int i6 = this.f39605u;
        String str = "";
        int i10 = this.f39608x;
        b.a this_apply = this.f39606v;
        LibraryCollection it = this.f39609y;
        b this$0 = this.f39607w;
        boolean z11 = true;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(it, "$it");
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                t<String, Integer, Boolean, String, Boolean, LibraryCollection, hs.k> tVar = this$0.f39610x;
                String id2 = it.getId();
                Integer valueOf = Integer.valueOf(i10);
                Boolean valueOf2 = Boolean.valueOf(it.isFree());
                String str2 = (String) u.j2(0, it.getStrings());
                if (str2 != null) {
                    str = str2;
                }
                if (this_apply.f39613u.getProgress() != 1.0f) {
                    z11 = false;
                }
                tVar.e(id2, valueOf, valueOf2, str, Boolean.valueOf(z11), it);
                return;
            default:
                kotlin.jvm.internal.i.g(this_apply, "$this_apply");
                kotlin.jvm.internal.i.g(this$0, "this$0");
                kotlin.jvm.internal.i.g(it, "$it");
                MotionLayout motionLayout = this_apply.f39613u;
                if (motionLayout.getProgress() == 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    motionLayout.m(0.0f);
                    z11 = false;
                } else {
                    motionLayout.A();
                }
                Integer valueOf3 = Integer.valueOf(i10);
                String str3 = (String) u.j2(0, it.getStrings());
                if (str3 != null) {
                    str = str3;
                }
                this$0.f39611y.invoke(valueOf3, str, Boolean.valueOf(z11));
                return;
        }
    }

    public /* synthetic */ a(b bVar, LibraryCollection libraryCollection, int i6, b.a aVar) {
        this.f39607w = bVar;
        this.f39609y = libraryCollection;
        this.f39608x = i6;
        this.f39606v = aVar;
    }
}
