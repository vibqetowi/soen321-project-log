package w4;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.y;
import com.bumptech.glide.Glide;
import java.util.HashSet;
/* compiled from: SupportRequestManagerFragment.java */
/* loaded from: classes.dex */
public class m extends Fragment {

    /* renamed from: u  reason: collision with root package name */
    public final w4.a f36418u;

    /* renamed from: v  reason: collision with root package name */
    public final a f36419v;

    /* renamed from: w  reason: collision with root package name */
    public final HashSet f36420w;

    /* renamed from: x  reason: collision with root package name */
    public m f36421x;

    /* renamed from: y  reason: collision with root package name */
    public com.bumptech.glide.f f36422y;

    /* renamed from: z  reason: collision with root package name */
    public Fragment f36423z;

    /* compiled from: SupportRequestManagerFragment.java */
    /* loaded from: classes.dex */
    public class a implements k {
        public a() {
        }

        public final String toString() {
            return super.toString() + "{fragment=" + m.this + "}";
        }
    }

    public m() {
        w4.a aVar = new w4.a();
        this.f36419v = new a();
        this.f36420w = new HashSet();
        this.f36418u = aVar;
    }

    public final void F(Context context, y yVar) {
        m mVar = this.f36421x;
        if (mVar != null) {
            mVar.f36420w.remove(this);
            this.f36421x = null;
        }
        j jVar = Glide.b(context).f5929z;
        jVar.getClass();
        m f = jVar.f(yVar, null, j.g(context));
        this.f36421x = f;
        if (!equals(f)) {
            this.f36421x.f36420w.add(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        Fragment fragment = this;
        while (fragment.getParentFragment() != null) {
            fragment = fragment.getParentFragment();
        }
        y fragmentManager = fragment.getFragmentManager();
        if (fragmentManager == null) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root, ancestor detached");
                return;
            }
            return;
        }
        try {
            F(getContext(), fragmentManager);
        } catch (IllegalStateException e10) {
            if (Log.isLoggable("SupportRMFragment", 5)) {
                Log.w("SupportRMFragment", "Unable to register fragment with root", e10);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f36418u.c();
        m mVar = this.f36421x;
        if (mVar != null) {
            mVar.f36420w.remove(this);
            this.f36421x = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        this.f36423z = null;
        m mVar = this.f36421x;
        if (mVar != null) {
            mVar.f36420w.remove(this);
            this.f36421x = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        this.f36418u.d();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        this.f36418u.e();
    }

    @Override // androidx.fragment.app.Fragment
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append("{parent=");
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f36423z;
        }
        sb2.append(parentFragment);
        sb2.append("}");
        return sb2.toString();
    }
}
