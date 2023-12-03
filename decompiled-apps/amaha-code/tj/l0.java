package tj;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.format.DateFormat;
import android.util.DisplayMetrics;
import android.widget.ImageView;
import android.widget.RemoteViews;
import com.google.android.gms.internal.p000firebaseauthapi.s5;
import com.moengage.pushbase.internal.MoEPushWorker;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.SessionManager;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: TemplateHelper.kt */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: a  reason: collision with root package name */
    public final ih.p f33108a;

    /* renamed from: b  reason: collision with root package name */
    public final String f33109b;

    /* renamed from: c  reason: collision with root package name */
    public final int[] f33110c;

    /* compiled from: TemplateHelper.kt */
    /* loaded from: classes.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f33112v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i6) {
            super(0);
            this.f33112v = i6;
        }

        @Override // ss.a
        public final String invoke() {
            return l0.this.f33109b + " scaleBitmap() : Max height: " + this.f33112v;
        }
    }

    /* compiled from: TemplateHelper.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ DisplayMetrics f33114v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(DisplayMetrics displayMetrics) {
            super(0);
            this.f33114v = displayMetrics;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(l0.this.f33109b);
            sb2.append(" scaleBitmap() : Device dimensions: width: ");
            DisplayMetrics displayMetrics = this.f33114v;
            sb2.append(displayMetrics.widthPixels);
            sb2.append(" height: ");
            sb2.append(displayMetrics.heightPixels);
            return sb2.toString();
        }
    }

    /* compiled from: TemplateHelper.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f33116v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f33117w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(int i6, int i10) {
            super(0);
            this.f33116v = i6;
            this.f33117w = i10;
        }

        @Override // ss.a
        public final String invoke() {
            return l0.this.f33109b + " scaleBitmap() : Actual Dimension - width: " + this.f33116v + "   height: " + this.f33117w;
        }
    }

    /* compiled from: TemplateHelper.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.v f33119v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f33120w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(kotlin.jvm.internal.v vVar, int i6) {
            super(0);
            this.f33119v = vVar;
            this.f33120w = i6;
        }

        @Override // ss.a
        public final String invoke() {
            return l0.this.f33109b + " scaleBitmap() : Scaled dimensions: width: " + this.f33119v.f23467u + " height: " + this.f33120w;
        }
    }

    /* compiled from: TemplateHelper.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ DisplayMetrics f33122v;

        /* renamed from: w  reason: collision with root package name */
        public final /* synthetic */ int f33123w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(DisplayMetrics displayMetrics, int i6) {
            super(0);
            this.f33122v = displayMetrics;
            this.f33123w = i6;
        }

        @Override // ss.a
        public final String invoke() {
            return l0.this.f33109b + " scaleBitmap() : Scaled dimensions: width: " + this.f33122v.widthPixels + " height: " + this.f33123w;
        }
    }

    /* compiled from: TemplateHelper.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" scaleBitmap() : ", l0.this.f33109b);
        }
    }

    public l0(ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f33108a = sdkInstance;
        this.f33109b = "RichPush_4.3.2_TemplateHelper";
        this.f33110c = new int[]{R.id.actionButton1, R.id.actionButton2};
    }

    public static JSONObject a(qj.a[] actions) {
        boolean z10;
        kotlin.jvm.internal.i.g(actions, "actions");
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        int i6 = 0;
        if (actions.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            jSONObject.put("actions", jSONArray);
            return jSONObject;
        }
        int length = actions.length;
        while (i6 < length) {
            qj.a aVar = actions[i6];
            i6++;
            jSONArray.put(aVar.f29611b);
        }
        jSONObject.put("actions", jSONArray);
        return jSONObject;
    }

    public static void c(RemoteViews remoteViews, Context context, jj.b metaData) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        Intent intent = new Intent(context, MoEPushWorker.class);
        Intent putExtras = intent.putExtras(metaData.f22066a.f28533i);
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put(SessionManager.KEY_NAME, "dismiss");
        int i6 = metaData.f22068c;
        jSONObject2.put("value", i6);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject2);
        jSONObject.put("actions", jSONArray);
        putExtras.putExtra("moe_action", jSONObject.toString()).setAction("ACTION_NOTIFICATION_CLOSE_CLICK");
        remoteViews.setOnClickPendingIntent(R.id.closeButton, di.b.l(context, i6, intent));
    }

    public static void g(Context context, RemoteViews remoteViews, int i6, uj.o template, jj.b metaData) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        String templateName = template.f34212a;
        kotlin.jvm.internal.i.g(templateName, "templateName");
        Bundle bundle = metaData.f22066a.f28533i;
        int i10 = metaData.f22068c;
        Intent g5 = fj.y.g(context, bundle, i10);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("templateName", templateName);
        jSONObject.put("cardId", -1);
        jSONObject.put("widgetId", -1);
        String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.i.f(jSONObject2, "templateTrackingMetaToJson(meta).toString()");
        g5.putExtra("moe_template_meta", jSONObject2);
        PendingIntent j10 = di.b.j(context, i10, g5);
        remoteViews.setOnClickPendingIntent(i6, j10);
        metaData.f22067b.f14662g = j10;
    }

    public static void l(uj.j jVar, RemoteViews remoteViews, int i6) {
        if (jVar == null) {
            return;
        }
        String str = jVar.f34200b;
        if (!gv.n.B0(str)) {
            remoteViews.setInt(i6, "setBackgroundColor", Color.parseColor(str));
        }
    }

    public static void n(RemoteViews remoteViews, boolean z10, qh.a aVar, int i6, int i10) {
        if (z10) {
            remoteViews.setImageViewResource(R.id.closeButton, i6);
            remoteViews.setViewVisibility(R.id.closeButton, 0);
        }
        if (!gv.n.B0(aVar.f29592d)) {
            remoteViews.setImageViewResource(R.id.separatorSummary, i10);
            remoteViews.setViewVisibility(R.id.separatorSummary, 0);
        }
        remoteViews.setImageViewResource(R.id.separatorTime, i10);
    }

    public static void o(RemoteViews remoteViews, qh.a defaultText) {
        kotlin.jvm.internal.i.g(defaultText, "defaultText");
        Spanned a10 = r0.b.a(defaultText.f29590b, 63);
        kotlin.jvm.internal.i.f(a10, "fromHtml(defaultText.tit…t.FROM_HTML_MODE_COMPACT)");
        remoteViews.setTextViewText(R.id.title, gv.r.i1(a10));
        String str = defaultText.f29591c;
        if (!gv.n.B0(str)) {
            Spanned a11 = r0.b.a(str, 63);
            kotlin.jvm.internal.i.f(a11, "fromHtml(defaultText.mes…t.FROM_HTML_MODE_COMPACT)");
            remoteViews.setTextViewText(R.id.message, gv.r.i1(a11));
        }
    }

    public static void p(RemoteViews remoteViews, qh.a defaultText, String appName, s5 headerStyle) {
        kotlin.jvm.internal.i.g(defaultText, "defaultText");
        kotlin.jvm.internal.i.g(appName, "appName");
        kotlin.jvm.internal.i.g(headerStyle, "headerStyle");
        Spanned a10 = r0.b.a(defaultText.f29590b, 63);
        kotlin.jvm.internal.i.f(a10, "fromHtml(defaultText.tit…t.FROM_HTML_MODE_COMPACT)");
        remoteViews.setTextViewText(R.id.title, gv.r.i1(a10));
        Spanned a11 = r0.b.a(defaultText.f29591c, 63);
        kotlin.jvm.internal.i.f(a11, "fromHtml(defaultText.mes…t.FROM_HTML_MODE_COMPACT)");
        remoteViews.setTextViewText(R.id.message, gv.r.i1(a11));
        if (!sj.z.a()) {
            String str = defaultText.f29592d;
            if (!gv.n.B0(str)) {
                remoteViews.setViewVisibility(R.id.summaryText, 0);
                remoteViews.setTextViewText(R.id.summaryText, r0.b.a(str, 63));
            }
            CharSequence format = DateFormat.format("hh:mm aaa", Calendar.getInstance().getTime());
            if (format != null) {
                remoteViews.setTextViewText(R.id.time, (String) format);
                if (!gv.n.B0(appName)) {
                    remoteViews.setTextViewText(R.id.appName, appName);
                    s(remoteViews, headerStyle);
                    return;
                }
                throw new IllegalStateException("App name cannot be empty");
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
        }
    }

    public static void q(RemoteViews remoteViews, s5 dismissCtaText, boolean z10) {
        kotlin.jvm.internal.i.g(dismissCtaText, "dismissCtaText");
        if (z10) {
            remoteViews.setTextViewText(R.id.closeButton, r0.b.a(dismissCtaText.f8126v, 63));
        }
        remoteViews.setViewVisibility(R.id.closeButton, 0);
    }

    public static void s(RemoteViews remoteViews, s5 headerStyle) {
        boolean z10;
        kotlin.jvm.internal.i.g(headerStyle, "headerStyle");
        String str = headerStyle.f8126v;
        if (str != null && !gv.n.B0(str)) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!z10) {
            int parseColor = Color.parseColor(headerStyle.f8126v);
            remoteViews.setTextColor(R.id.appName, parseColor);
            remoteViews.setTextColor(R.id.time, parseColor);
        }
    }

    public static void u(l0 l0Var, RemoteViews remoteViews, int i6) {
        l0Var.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            remoteViews.setViewOutlinePreferredRadius(i6, 4.0f, 1);
        }
    }

    public final void b(Context context, jj.b metaData, uj.o template, RemoteViews remoteViews, List<? extends uj.r> list, boolean z10) {
        String str;
        boolean z11;
        int i6;
        int i10;
        boolean z12;
        Intent intent;
        boolean z13;
        l0 l0Var = this;
        List<? extends uj.r> actionButtons = list;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(actionButtons, "actionButtons");
        boolean z14 = true;
        boolean z15 = !list.isEmpty();
        int i11 = 0;
        ih.p pVar = l0Var.f33108a;
        if (z15) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int size = new he.e0(displayMetrics.widthPixels, displayMetrics.heightPixels, 1).f17480b / list.size();
            int min = Math.min(list.size(), 2);
            int i12 = 0;
            while (i12 < min) {
                int i13 = i12 + 1;
                uj.r rVar = actionButtons.get(i12);
                if (kotlin.jvm.internal.i.b("button", rVar.f34223a)) {
                    int[] iArr = l0Var.f33110c;
                    remoteViews.setViewVisibility(iArr[i12], i11);
                    if (!sj.z.a()) {
                        remoteViews.setInt(iArr[i12], "setMaxWidth", size);
                    }
                    remoteViews.setTextViewText(iArr[i12], r0.b.a(rVar.f34225c, 63));
                    uj.n nVar = rVar.f34226d;
                    if (nVar != null && (!gv.n.B0(nVar.a()))) {
                        remoteViews.setInt(iArr[i12], "setBackgroundColor", Color.parseColor(nVar.a()));
                    }
                    String templateName = template.f34212a;
                    kotlin.jvm.internal.i.g(templateName, "templateName");
                    pj.b bVar = metaData.f22066a;
                    Bundle bundle = bVar.f28533i;
                    int i14 = metaData.f22068c;
                    Intent g5 = fj.y.g(context, bundle, i14);
                    qj.a[] aVarArr = rVar.f34227e;
                    if (aVarArr != null) {
                        is.b0 N = kotlin.jvm.internal.h.N(aVarArr);
                        while (N.hasNext()) {
                            i6 = size;
                            i10 = min;
                            if (kotlin.jvm.internal.i.b(((qj.a) N.next()).f29610a, "remindLater")) {
                                z12 = true;
                                break;
                            } else {
                                min = i10;
                                size = i6;
                            }
                        }
                    }
                    i6 = size;
                    i10 = min;
                    z12 = false;
                    if (z12) {
                        intent = fj.y.f(context, bVar.f28533i, i14);
                    } else {
                        intent = g5;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("templateName", templateName);
                    jSONObject.put("cardId", -1);
                    int i15 = rVar.f34224b;
                    jSONObject.put("widgetId", i15);
                    String jSONObject2 = jSONObject.toString();
                    kotlin.jvm.internal.i.f(jSONObject2, "templateTrackingMetaToJson(meta).toString()");
                    intent.putExtra("moe_template_meta", jSONObject2);
                    if (aVarArr.length == 0) {
                        z14 = true;
                        z13 = true;
                    } else {
                        z14 = true;
                        z13 = false;
                    }
                    if (!z13) {
                        new l0(pVar);
                        intent.putExtra("moe_action", a(aVarArr).toString());
                    }
                    remoteViews.setOnClickPendingIntent(iArr[i12], di.b.j(context, i15 + 1000 + i14, intent));
                    l0Var = this;
                    actionButtons = list;
                    i12 = i13;
                    min = i10;
                    size = i6;
                    i11 = 0;
                } else {
                    throw new IllegalStateException("Only button widget expected.".toString());
                }
            }
        }
        if (z10) {
            if (!sj.z.a()) {
                hh.g logger = pVar.f20105d;
                kotlin.jvm.internal.i.g(logger, "logger");
                String str2 = null;
                uj.f fVar = template.f34215d;
                if (fVar == null) {
                    str = null;
                } else {
                    str = fVar.f34192a;
                }
                uj.h hVar = template.f34216e;
                if (hVar != null) {
                    str2 = hVar.f34195a;
                }
                if (str != null && str2 != null && (kotlin.jvm.internal.i.b(str, "timer") || kotlin.jvm.internal.i.b(str2, "timer") || kotlin.jvm.internal.i.b(str, "timerWithProgressbar") || kotlin.jvm.internal.i.b(str2, "timerWithProgressbar"))) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    z14 = false;
                }
            }
            q(remoteViews, template.f34219i, z14);
            c(remoteViews, context, metaData);
        }
    }

    public final void d(Context context, jj.b metaData, uj.o template, RemoteViews remoteViews, uj.i iVar, uj.a aVar, int i6, int i10) {
        boolean z10;
        boolean z11;
        pj.b bVar;
        boolean z12;
        boolean z13;
        RemoteViews remoteViews2 = remoteViews;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        kotlin.jvm.internal.i.g(template, "template");
        qj.a[] aVarArr = iVar.f34227e;
        if (aVarArr.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = metaData.f22068c;
        pj.b bVar2 = metaData.f22066a;
        String templateName = template.f34212a;
        qj.a[] aVarArr2 = aVar.f34186d;
        int i12 = aVar.f34183a;
        if (z10) {
            if (aVarArr2.length == 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z13) {
                kotlin.jvm.internal.i.g(templateName, "templateName");
                Intent g5 = fj.y.g(context, bVar2.f28533i, i11);
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("templateName", templateName);
                jSONObject.put("cardId", i12);
                jSONObject.put("widgetId", -1);
                String jSONObject2 = jSONObject.toString();
                kotlin.jvm.internal.i.f(jSONObject2, "templateTrackingMetaToJson(meta).toString()");
                g5.putExtra("moe_template_meta", jSONObject2);
                remoteViews2.setOnClickPendingIntent(i6, di.b.j(context, i11, g5));
                return;
            }
        }
        kotlin.jvm.internal.i.g(templateName, "templateName");
        if (aVarArr.length == 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            bVar = bVar2;
        } else {
            Intent g10 = fj.y.g(context, bVar2.f28533i, i11);
            bVar = bVar2;
            new l0(this.f33108a);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("templateName", templateName);
            jSONObject3.put("cardId", i12);
            int i13 = iVar.f34224b;
            jSONObject3.put("widgetId", i13);
            String jSONObject4 = jSONObject3.toString();
            kotlin.jvm.internal.i.f(jSONObject4, "templateTrackingMetaToJson(meta).toString()");
            g10.putExtra("moe_template_meta", jSONObject4).putExtra("moe_action", a(aVarArr).toString());
            remoteViews2 = remoteViews;
            remoteViews2.setOnClickPendingIntent(i6, di.b.j(context, i13 + 100 + i11, g10));
        }
        if (aVarArr2.length == 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12) {
            Intent g11 = fj.y.g(context, bVar.f28533i, i11);
            JSONObject jSONObject5 = new JSONObject();
            jSONObject5.put("templateName", templateName);
            jSONObject5.put("cardId", i12);
            jSONObject5.put("widgetId", -1);
            String jSONObject6 = jSONObject5.toString();
            kotlin.jvm.internal.i.f(jSONObject6, "templateTrackingMetaToJson(meta).toString()");
            g11.putExtra("moe_template_meta", jSONObject6).putExtra("moe_action", a(aVarArr2).toString());
            remoteViews2.setOnClickPendingIntent(i10, di.b.j(context, i12 + 1000 + i11, g11));
        }
    }

    public final void f(RemoteViews remoteViews, int i6, uj.o template, jj.b metaData) {
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        u(this, remoteViews, i6);
        Spanned a10 = r0.b.a(template.f34213b.f29592d, 63);
        kotlin.jvm.internal.i.f(a10, "fromHtml(template.defaul…t.FROM_HTML_MODE_COMPACT)");
        metaData.f22067b.k(gv.r.i1(a10));
    }

    public final boolean h(Context context, RemoteViews remoteViews, jj.b metaData, uj.o template) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        kotlin.jvm.internal.i.g(template, "template");
        uj.h hVar = template.f34216e;
        if (hVar == null) {
            return false;
        }
        uj.a aVar = hVar.f34198d.get(0);
        if (aVar.f34184b.isEmpty()) {
            return false;
        }
        uj.r rVar = aVar.f34184b.get(0);
        if (!kotlin.jvm.internal.i.b("image", rVar.f34223a)) {
            return false;
        }
        return i(context, metaData, template, remoteViews, (uj.i) rVar, aVar, null);
    }

    public final boolean i(Context context, jj.b metaData, uj.o template, RemoteViews remoteViews, uj.i iVar, uj.a aVar, Bitmap bitmap) {
        Bitmap bitmap2;
        int i6;
        boolean z10;
        Bitmap bitmap3;
        int i10;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        kotlin.jvm.internal.i.g(template, "template");
        uj.h hVar = template.f34216e;
        if (hVar == null) {
            return false;
        }
        if (bitmap == null) {
            bitmap2 = di.b.e(iVar.f34225c);
        } else {
            bitmap2 = bitmap;
        }
        if (bitmap2 == null) {
            return false;
        }
        if (sj.z.a()) {
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
            ImageView.ScaleType scaleType2 = iVar.f;
            int i11 = R.id.centerCropImage;
            if (scaleType2 == scaleType) {
                remoteViews.setViewVisibility(R.id.centerInsideImage, 8);
                u(this, remoteViews, R.id.centerCropImage);
            } else {
                remoteViews.setViewVisibility(R.id.centerCropImage, 8);
                i11 = R.id.centerInsideImage;
            }
            bitmap3 = bitmap2;
            i10 = i11;
        } else {
            if (!hVar.f34197c.isEmpty()) {
                i6 = fj.y.i(152, context);
            } else {
                i6 = fj.y.i(192, context);
            }
            if (di.b.g(context) == ih.h.TABLET) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (!z10) {
                bitmap2 = m(context, bitmap2, i6);
            }
            if (z10) {
                remoteViews.setViewVisibility(R.id.horizontalFitCenterImage, 8);
                remoteViews.setViewVisibility(R.id.verticalImage, 8);
            } else if (bitmap2.getHeight() >= bitmap2.getWidth()) {
                remoteViews.setViewVisibility(R.id.horizontalCenterCropImage, 8);
                remoteViews.setViewVisibility(R.id.horizontalFitCenterImage, 8);
                bitmap3 = bitmap2;
                i10 = R.id.verticalImage;
            } else if (bitmap2.getHeight() >= i6) {
                remoteViews.setViewVisibility(R.id.horizontalFitCenterImage, 8);
                remoteViews.setViewVisibility(R.id.verticalImage, 8);
            } else {
                remoteViews.setViewVisibility(R.id.horizontalCenterCropImage, 8);
                remoteViews.setViewVisibility(R.id.verticalImage, 8);
                bitmap3 = bitmap2;
                i10 = R.id.horizontalFitCenterImage;
            }
            bitmap3 = bitmap2;
            i10 = R.id.horizontalCenterCropImage;
        }
        remoteViews.setImageViewBitmap(i10, bitmap3);
        remoteViews.setViewVisibility(i10, 0);
        d(context, metaData, template, remoteViews, iVar, aVar, i10, R.id.card);
        return true;
    }

    public final void k(RemoteViews remoteViews, uj.o template, pj.b payload) {
        Bitmap bitmap;
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(payload, "payload");
        if (!template.f34217g) {
            return;
        }
        pj.a aVar = payload.f28532h;
        if (!gv.n.B0(aVar.f28524i)) {
            bitmap = di.b.e(aVar.f28524i);
        } else {
            bitmap = null;
        }
        if (bitmap != null) {
            remoteViews.setImageViewBitmap(R.id.largeIcon, bitmap);
        } else {
            int i6 = this.f33108a.f20103b.f12858d.f28417b.f28415b;
            if (i6 != -1) {
                remoteViews.setImageViewResource(R.id.largeIcon, i6);
            }
        }
        if (sj.z.a()) {
            u(this, remoteViews, R.id.largeIcon);
        }
        remoteViews.setViewVisibility(R.id.largeIcon, 0);
    }

    public final Bitmap m(Context context, Bitmap bitmap, int i6) {
        ih.p pVar = this.f33108a;
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(bitmap, "bitmap");
        try {
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            hh.g gVar = pVar.f20105d;
            hh.g gVar2 = pVar.f20105d;
            hh.g.b(gVar, 0, new a(i6), 3);
            hh.g.b(gVar2, 0, new b(displayMetrics), 3);
            hh.g.b(gVar2, 0, new c(width, height), 3);
            if (height >= width) {
                kotlin.jvm.internal.v vVar = new kotlin.jvm.internal.v();
                int i10 = (width * i6) / height;
                vVar.f23467u = i10;
                int i11 = displayMetrics.widthPixels;
                if (i10 > i11) {
                    vVar.f23467u = i11;
                }
                hh.g.b(gVar2, 0, new d(vVar, i6), 3);
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, vVar.f23467u, i6, true);
                kotlin.jvm.internal.i.f(createScaledBitmap, "fun scaleBitmap(context:…      return bitmap\n    }");
                return createScaledBitmap;
            }
            int i12 = (height * displayMetrics.widthPixels) / width;
            hh.g.b(gVar2, 0, new e(displayMetrics, i12), 3);
            Bitmap createScaledBitmap2 = Bitmap.createScaledBitmap(bitmap, displayMetrics.widthPixels, i12, true);
            kotlin.jvm.internal.i.f(createScaledBitmap2, "fun scaleBitmap(context:…      return bitmap\n    }");
            return createScaledBitmap2;
        } catch (Throwable th2) {
            pVar.f20105d.a(1, th2, new f());
            return bitmap;
        }
    }

    public final void r(Context context, RemoteViews remoteViews, jj.b metaData, uj.o template) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        pj.b payload = metaData.f22066a;
        kotlin.jvm.internal.i.g(payload, "payload");
        String str = template.f;
        boolean b10 = kotlin.jvm.internal.i.b(str, "darkGrey");
        qh.a aVar = template.f34213b;
        ih.p pVar = this.f33108a;
        pj.a aVar2 = payload.f28532h;
        if (b10) {
            n(remoteViews, aVar2.f28521e, aVar, R.drawable.moe_rich_push_dark_cross, R.drawable.moe_rich_push_dark_separator);
        } else if (kotlin.jvm.internal.i.b(str, "lightGrey")) {
            n(remoteViews, aVar2.f28521e, aVar, R.drawable.moe_rich_push_light_cross, R.drawable.moe_rich_push_light_separator);
        } else {
            hh.g.b(pVar.f20105d, 1, new m0(this), 2);
            n(remoteViews, aVar2.f28521e, aVar, R.drawable.moe_rich_push_light_cross, R.drawable.moe_rich_push_light_separator);
        }
        int i6 = pVar.f20103b.f12858d.f28417b.f28414a;
        if (i6 != -1) {
            remoteViews.setImageViewResource(R.id.smallIcon, i6);
            t(context, remoteViews);
        }
    }

    public final void t(Context context, RemoteViews remoteViews) {
        kotlin.jvm.internal.i.g(context, "context");
        this.f33108a.f20103b.f12858d.f28417b.getClass();
    }
}
