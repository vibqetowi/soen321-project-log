package tj;

import android.content.Context;
import android.text.format.DateFormat;
import android.widget.RemoteViews;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.theinnerhour.b2b.R;
import java.util.Calendar;
/* compiled from: ImageBannerBuilder.kt */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a  reason: collision with root package name */
    public final Context f33155a;

    /* renamed from: b  reason: collision with root package name */
    public final uj.o f33156b;

    /* renamed from: c  reason: collision with root package name */
    public final jj.b f33157c;

    /* renamed from: d  reason: collision with root package name */
    public final ih.p f33158d;

    /* renamed from: e  reason: collision with root package name */
    public final String f33159e;

    public u(Context context, uj.o template, jj.b metaData, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f33155a = context;
        this.f33156b = template;
        this.f33157c = metaData;
        this.f33158d = sdkInstance;
        this.f33159e = "RichPush_4.3.2_ImageBannerBuilder";
    }

    public final void a(l0 l0Var, RemoteViews remoteViews, boolean z10) {
        int i6;
        int i10;
        jj.b bVar = this.f33157c;
        boolean z11 = bVar.f22066a.f28532h.f28521e;
        Context context = this.f33155a;
        uj.o oVar = this.f33156b;
        if (z11) {
            String assetColor = oVar.f;
            kotlin.jvm.internal.i.g(assetColor, "assetColor");
            if (kotlin.jvm.internal.i.b("darkGrey", assetColor)) {
                i10 = R.drawable.moe_rich_push_dark_cross;
            } else {
                i10 = R.drawable.moe_rich_push_light_cross;
            }
            remoteViews.setImageViewResource(R.id.closeButton, i10);
            remoteViews.setViewVisibility(R.id.closeButton, 0);
            l0.c(remoteViews, context, bVar);
        }
        s5 s5Var = oVar.f34218h;
        if (z10) {
            remoteViews.setViewVisibility(R.id.appInfo, 0);
            ih.p pVar = this.f33158d;
            remoteViews.setImageViewResource(R.id.smallIcon, pVar.f20103b.f12858d.f28417b.f28414a);
            new l0(pVar).t(context, remoteViews);
            CharSequence format = DateFormat.format("hh:mm aaa", Calendar.getInstance().getTime());
            if (format != null) {
                remoteViews.setTextViewText(R.id.time, (String) format);
                remoteViews.setTextViewText(R.id.appName, sj.z.b(context));
                l0.s(remoteViews, s5Var);
                if (kotlin.jvm.internal.i.b(oVar.f, "darkGrey")) {
                    i6 = R.drawable.moe_rich_push_dark_separator;
                } else {
                    i6 = R.drawable.moe_rich_push_light_separator;
                }
                remoteViews.setImageViewResource(R.id.separatorTime, i6);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }
}
