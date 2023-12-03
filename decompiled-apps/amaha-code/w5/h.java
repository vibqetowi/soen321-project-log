package w5;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import com.facebook.FacebookException;
import com.theinnerhour.b2b.utils.Constants;
import h5.a;
import java.util.Date;
import kotlin.Metadata;
import w5.j0;
/* compiled from: FacebookDialogFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lw5/h;", "Landroidx/fragment/app/n;", "<init>", "()V", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class h extends androidx.fragment.app.n {

    /* renamed from: v  reason: collision with root package name */
    public static final /* synthetic */ int f36465v = 0;

    /* renamed from: u  reason: collision with root package name */
    public Dialog f36466u;

    public final void F(Bundle bundle, FacebookException facebookException) {
        int i6;
        androidx.fragment.app.p activity = getActivity();
        if (activity == null) {
            return;
        }
        w wVar = w.f36549a;
        Intent intent = activity.getIntent();
        kotlin.jvm.internal.i.f(intent, "fragmentActivity.intent");
        Intent e10 = w.e(intent, bundle, facebookException);
        if (facebookException == null) {
            i6 = -1;
        } else {
            i6 = 0;
        }
        activity.setResult(i6, e10);
        activity.finish();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration newConfig) {
        kotlin.jvm.internal.i.g(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        if ((this.f36466u instanceof j0) && isResumed()) {
            Dialog dialog = this.f36466u;
            if (dialog != null) {
                ((j0) dialog).d();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        androidx.fragment.app.p activity;
        boolean z10;
        j0 kVar;
        String string;
        Bundle bundle2;
        super.onCreate(bundle);
        if (this.f36466u == null && (activity = getActivity()) != null) {
            Intent intent = activity.getIntent();
            w wVar = w.f36549a;
            kotlin.jvm.internal.i.f(intent, "intent");
            Bundle h10 = w.h(intent);
            if (h10 == null) {
                z10 = false;
            } else {
                z10 = h10.getBoolean("is_fallback", false);
            }
            String str = null;
            if (!z10) {
                if (h10 == null) {
                    string = null;
                } else {
                    string = h10.getString("action");
                }
                if (h10 == null) {
                    bundle2 = null;
                } else {
                    bundle2 = h10.getBundle("params");
                }
                if (e0.A(string)) {
                    h5.p pVar = h5.p.f17269a;
                    activity.finish();
                    return;
                } else if (string != null) {
                    Date date = h5.a.F;
                    h5.a b10 = a.b.b();
                    if (!a.b.c()) {
                        str = e0.q(activity);
                    }
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                    }
                    j0.c cVar = new j0.c(this) { // from class: w5.g

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ h f36463b;

                        {
                            this.f36463b = this;
                        }

                        @Override // w5.j0.c
                        public final void a(Bundle bundle3, FacebookException facebookException) {
                            int i6 = r2;
                            h this$0 = this.f36463b;
                            switch (i6) {
                                case 0:
                                    int i10 = h.f36465v;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.F(bundle3, facebookException);
                                    return;
                                default:
                                    int i11 = h.f36465v;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity2 = this$0.getActivity();
                                    if (activity2 != null) {
                                        Intent intent2 = new Intent();
                                        if (bundle3 == null) {
                                            bundle3 = new Bundle();
                                        }
                                        intent2.putExtras(bundle3);
                                        activity2.setResult(-1, intent2);
                                        activity2.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                    if (b10 != null) {
                        bundle2.putString("app_id", b10.B);
                        bundle2.putString("access_token", b10.f17180y);
                    } else {
                        bundle2.putString("app_id", str);
                    }
                    int i6 = j0.G;
                    j0.b(activity);
                    kVar = new j0(activity, string, bundle2, g6.a0.FACEBOOK, cVar);
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            } else {
                if (h10 != null) {
                    str = h10.getString(Constants.NOTIFICATION_URL);
                }
                if (e0.A(str)) {
                    h5.p pVar2 = h5.p.f17269a;
                    activity.finish();
                    return;
                }
                String o10 = defpackage.b.o(new Object[]{h5.p.b()}, 1, "fb%s://bridge/", "java.lang.String.format(format, *args)");
                int i10 = k.I;
                if (str != null) {
                    j0.b(activity);
                    kVar = new k(activity, str, o10);
                    kVar.f36479w = new j0.c(this) { // from class: w5.g

                        /* renamed from: b  reason: collision with root package name */
                        public final /* synthetic */ h f36463b;

                        {
                            this.f36463b = this;
                        }

                        @Override // w5.j0.c
                        public final void a(Bundle bundle3, FacebookException facebookException) {
                            int i62 = r2;
                            h this$0 = this.f36463b;
                            switch (i62) {
                                case 0:
                                    int i102 = h.f36465v;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    this$0.F(bundle3, facebookException);
                                    return;
                                default:
                                    int i11 = h.f36465v;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity2 = this$0.getActivity();
                                    if (activity2 != null) {
                                        Intent intent2 = new Intent();
                                        if (bundle3 == null) {
                                            bundle3 = new Bundle();
                                        }
                                        intent2.putExtras(bundle3);
                                        activity2.setResult(-1, intent2);
                                        activity2.finish();
                                        return;
                                    }
                                    return;
                            }
                        }
                    };
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                }
            }
            this.f36466u = kVar;
        }
    }

    @Override // androidx.fragment.app.n
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = this.f36466u;
        if (dialog == null) {
            F(null, null);
            setShowsDialog(false);
            Dialog onCreateDialog = super.onCreateDialog(bundle);
            kotlin.jvm.internal.i.f(onCreateDialog, "super.onCreateDialog(savedInstanceState)");
            return onCreateDialog;
        } else if (dialog != null) {
            return dialog;
        } else {
            throw new NullPointerException("null cannot be cast to non-null type android.app.Dialog");
        }
    }

    @Override // androidx.fragment.app.n, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        Dialog dialog = getDialog();
        if (dialog != null && getRetainInstance()) {
            dialog.setDismissMessage(null);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        Dialog dialog = this.f36466u;
        if (dialog instanceof j0) {
            if (dialog != null) {
                ((j0) dialog).d();
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type com.facebook.internal.WebDialog");
        }
    }
}
