package g6;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.facebook.FacebookException;
import com.theinnerhour.b2b.R;
import g6.p;
import h5.a;
import java.util.ArrayList;
import java.util.Date;
import kotlin.Metadata;
/* compiled from: LoginFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lg6/r;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public class r extends Fragment {

    /* renamed from: z  reason: collision with root package name */
    public static final /* synthetic */ int f16321z = 0;

    /* renamed from: u  reason: collision with root package name */
    public String f16322u;

    /* renamed from: v  reason: collision with root package name */
    public p.d f16323v;

    /* renamed from: w  reason: collision with root package name */
    public p f16324w;

    /* renamed from: x  reason: collision with root package name */
    public androidx.activity.result.c<Intent> f16325x;

    /* renamed from: y  reason: collision with root package name */
    public View f16326y;

    /* compiled from: LoginFragment.kt */
    /* loaded from: classes.dex */
    public static final class a implements p.a {
        public a() {
        }

        @Override // g6.p.a
        public final void a() {
            View view = r.this.f16326y;
            if (view != null) {
                view.setVisibility(0);
            } else {
                kotlin.jvm.internal.i.q("progressBar");
                throw null;
            }
        }

        @Override // g6.p.a
        public final void b() {
            View view = r.this.f16326y;
            if (view != null) {
                view.setVisibility(8);
            } else {
                kotlin.jvm.internal.i.q("progressBar");
                throw null;
            }
        }
    }

    public final p F() {
        p pVar = this.f16324w;
        if (pVar != null) {
            return pVar;
        }
        kotlin.jvm.internal.i.q("loginClient");
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i6, int i10, Intent intent) {
        super.onActivityResult(i6, i10, intent);
        F().i(i6, i10, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        p pVar;
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle == null) {
            pVar = null;
        } else {
            pVar = (p) bundle.getParcelable("loginClient");
        }
        if (pVar != null) {
            if (pVar.f16298w == null) {
                pVar.f16298w = this;
            } else {
                throw new FacebookException("Can't set fragment once it is already set.");
            }
        } else {
            pVar = new p(this);
        }
        this.f16324w = pVar;
        F().f16299x = new f0.b(5, this);
        androidx.fragment.app.p activity = getActivity();
        if (activity == null) {
            return;
        }
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f16322u = callingActivity.getPackageName();
        }
        Intent intent = activity.getIntent();
        if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
            this.f16323v = (p.d) bundleExtra.getParcelable("request");
        }
        androidx.activity.result.c<Intent> registerForActivityResult = registerForActivityResult(new e.d(), new f0.b(6, new q(this, activity)));
        kotlin.jvm.internal.i.f(registerForActivityResult, "registerForActivityResult(\n            ActivityResultContracts.StartActivityForResult(),\n            getLoginMethodHandlerCallback(activity))");
        this.f16325x = registerForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = inflater.inflate(R.layout.com_facebook_login_fragment, viewGroup, false);
        View findViewById = inflate.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        kotlin.jvm.internal.i.f(findViewById, "view.findViewById<View>(R.id.com_facebook_login_fragment_progress_bar)");
        this.f16326y = findViewById;
        F().f16300y = new a();
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        y f = F().f();
        if (f != null) {
            f.b();
        }
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        View findViewById;
        super.onPause();
        View view = getView();
        if (view == null) {
            findViewById = null;
        } else {
            findViewById = view.findViewById(R.id.com_facebook_login_fragment_progress_bar);
        }
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        boolean z10;
        boolean z11;
        super.onResume();
        if (this.f16322u == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            androidx.fragment.app.p activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        p F = F();
        p.d dVar = this.f16323v;
        p.d dVar2 = F.A;
        boolean z12 = true;
        if (dVar2 != null && F.f16297v >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10 && dVar != null) {
            if (dVar2 == null) {
                Date date = h5.a.F;
                if (!a.b.c() || F.b()) {
                    F.A = dVar;
                    ArrayList arrayList = new ArrayList();
                    a0 a0Var = a0.INSTAGRAM;
                    a0 a0Var2 = dVar.F;
                    if (a0Var2 == a0Var) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    o oVar = dVar.f16302u;
                    if (z11) {
                        if (!h5.p.f17282o && oVar.f16295z) {
                            arrayList.add(new m(F));
                        }
                    } else {
                        if (oVar.f16290u) {
                            arrayList.add(new k(F));
                        }
                        if (!h5.p.f17282o && oVar.f16291v) {
                            arrayList.add(new n(F));
                        }
                    }
                    if (oVar.f16294y) {
                        arrayList.add(new b(F));
                    }
                    if (oVar.f16292w) {
                        arrayList.add(new d0(F));
                    }
                    if (a0Var2 != a0Var) {
                        z12 = false;
                    }
                    if (!z12 && oVar.f16293x) {
                        arrayList.add(new i(F));
                    }
                    Object[] array = arrayList.toArray(new y[0]);
                    if (array != null) {
                        F.f16296u = (y[]) array;
                        F.j();
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                return;
            }
            throw new FacebookException("Attempted to authorize while a request is pending.");
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.i.g(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putParcelable("loginClient", F());
    }
}
