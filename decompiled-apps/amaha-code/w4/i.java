package w4;

import android.app.Activity;
import android.app.Fragment;
import android.util.Log;
import com.bumptech.glide.Glide;
import java.util.HashSet;
/* compiled from: RequestManagerFragment.java */
@Deprecated
/* loaded from: classes.dex */
public final class i extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public final w4.a f36401u;

    /* renamed from: v  reason: collision with root package name */
    public final a f36402v;

    /* renamed from: w  reason: collision with root package name */
    public final HashSet f36403w;

    /* renamed from: x  reason: collision with root package name */
    public com.bumptech.glide.f f36404x;

    /* renamed from: y  reason: collision with root package name */
    public i f36405y;

    /* renamed from: z  reason: collision with root package name */
    public Fragment f36406z;

    /* compiled from: RequestManagerFragment.java */
    /* loaded from: classes.dex */
    public class a implements k {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + i.this + "}";
        }
    }

    public i() {
        w4.a aVar = new w4.a();
        this.f36402v = new a();
        this.f36403w = new HashSet();
        this.f36401u = aVar;
    }

    public final void a(Activity activity) {
        i iVar = this.f36405y;
        if (iVar != null) {
            iVar.f36403w.remove(this);
            this.f36405y = null;
        }
        j jVar = Glide.b(activity).f5929z;
        jVar.getClass();
        i e10 = jVar.e(activity.getFragmentManager(), j.g(activity));
        this.f36405y = e10;
        if (!equals(e10)) {
            this.f36405y.f36403w.add(this);
        }
    }

    @Override // android.app.Fragment
    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f36401u.c();
        i iVar = this.f36405y;
        if (iVar != null) {
            iVar.f36403w.remove(this);
            this.f36405y = null;
        }
    }

    @Override // android.app.Fragment
    public final void onDetach() {
        super.onDetach();
        i iVar = this.f36405y;
        if (iVar != null) {
            iVar.f36403w.remove(this);
            this.f36405y = null;
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f36401u.d();
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f36401u.e();
    }

    @Override // android.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f36406z;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
