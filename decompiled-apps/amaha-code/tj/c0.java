package tj;

import android.content.Context;
import android.widget.RemoteViews;
import com.theinnerhour.b2b.R;
/* compiled from: StylizedBasicTemplateBuilder.kt */
/* loaded from: classes.dex */
public final class c0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f33069a;

    /* renamed from: b  reason: collision with root package name */
    public final uj.o f33070b;

    /* renamed from: c  reason: collision with root package name */
    public final jj.b f33071c;

    /* renamed from: d  reason: collision with root package name */
    public final ih.p f33072d;

    /* renamed from: e  reason: collision with root package name */
    public final String f33073e;

    public c0(Context context, uj.o template, jj.b metaData, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f33069a = context;
        this.f33070b = template;
        this.f33071c = metaData;
        this.f33072d = sdkInstance;
        this.f33073e = "RichPush_4.3.2_StylizedBasicTemplateBuilder";
    }

    public final void a(uj.o oVar, RemoteViews remoteViews, l0 l0Var, boolean z10) {
        uj.h hVar = oVar.f34216e;
        if (hVar == null) {
            return;
        }
        if ((!hVar.f34198d.isEmpty()) && z10) {
            remoteViews.setBoolean(R.id.message, "setSingleLine", true);
            remoteViews.setInt(R.id.message, "setMaxLines", 1);
        } else if (!oVar.f34216e.f34197c.isEmpty()) {
            remoteViews.setBoolean(R.id.message, "setSingleLine", false);
            remoteViews.setInt(R.id.message, "setMaxLines", 10);
        } else {
            remoteViews.setBoolean(R.id.message, "setSingleLine", false);
            remoteViews.setInt(R.id.message, "setMaxLines", 13);
        }
        l0Var.r(this.f33069a, remoteViews, this.f33071c, oVar);
    }

    public final RemoteViews b(boolean z10, boolean z11) {
        boolean a10 = sj.z.a();
        Context context = this.f33069a;
        if (a10) {
            if (!z10 && !z11) {
                return new RemoteViews(context.getPackageName(), (int) R.layout.moe_rich_push_stylized_basic_big_picture_without_action_button_decorated_style);
            }
            return new RemoteViews(context.getPackageName(), (int) R.layout.moe_rich_push_stylized_basic_big_picture_with_action_button_decorated_style);
        }
        ih.p pVar = this.f33072d;
        if (z10) {
            return new RemoteViews(context.getPackageName(), sj.z.c(R.layout.moe_rich_push_stylized_basic_big_picture_with_action_button, R.layout.moe_rich_push_stylized_basic_big_picture_with_action_button_layout_big, pVar));
        }
        return new RemoteViews(context.getPackageName(), sj.z.c(R.layout.moe_rich_push_stylized_basic_big_picture_without_action_button, R.layout.moe_rich_push_stylized_basic_big_picture_without_action_button_layout_big, pVar));
    }
}
