package il;

import android.content.DialogInterface;
import android.os.Bundle;
import kotlin.jvm.internal.u;
import r1.b0;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class p implements DialogInterface.OnDismissListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f20381u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ u f20382v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ String f20383w;

    public /* synthetic */ p(u uVar, String str, int i6) {
        this.f20381u = i6;
        this.f20382v = uVar;
        this.f20383w = str;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        int i6 = this.f20381u;
        String feedbackSource = this.f20383w;
        u clicked = this.f20382v;
        switch (i6) {
            case 0:
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                if (!clicked.f23466u) {
                    String str = gk.a.f16573a;
                    Bundle a10 = b0.a("trigger_reason", feedbackSource);
                    hs.k kVar = hs.k.f19476a;
                    gk.a.b(a10, "rating_star_popup_dismiss");
                    return;
                }
                return;
            case 1:
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                if (!clicked.f23466u) {
                    String str2 = gk.a.f16573a;
                    Bundle a11 = b0.a("trigger_reason", feedbackSource);
                    hs.k kVar2 = hs.k.f19476a;
                    gk.a.b(a11, "rating_playstore_popup_dismiss");
                    return;
                }
                return;
            default:
                kotlin.jvm.internal.i.g(clicked, "$clicked");
                kotlin.jvm.internal.i.g(feedbackSource, "$feedbackSource");
                if (!clicked.f23466u) {
                    String str3 = gk.a.f16573a;
                    Bundle a12 = b0.a("trigger_reason", feedbackSource);
                    hs.k kVar3 = hs.k.f19476a;
                    gk.a.b(a12, "rating_low_feedback_popup_dismiss");
                    return;
                }
                return;
        }
    }
}
