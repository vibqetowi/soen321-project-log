package tj;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
import com.moengage.richnotification.internal.MoERichPushIntentService;
import com.theinnerhour.b2b.R;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: CarouselBuilder.kt */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final Context f33040a;

    /* renamed from: b  reason: collision with root package name */
    public final uj.o f33041b;

    /* renamed from: c  reason: collision with root package name */
    public final jj.b f33042c;

    /* renamed from: d  reason: collision with root package name */
    public final ih.p f33043d;

    /* renamed from: e  reason: collision with root package name */
    public final String f33044e;
    public final l0 f;

    /* renamed from: g  reason: collision with root package name */
    public final pi.o[] f33045g;

    /* renamed from: h  reason: collision with root package name */
    public final pi.o[] f33046h;

    /* renamed from: i  reason: collision with root package name */
    public final pi.o[] f33047i;

    /* renamed from: j  reason: collision with root package name */
    public final pi.o[] f33048j;

    /* renamed from: k  reason: collision with root package name */
    public final pi.o[] f33049k;

    /* renamed from: l  reason: collision with root package name */
    public final int[] f33050l;

    /* compiled from: CarouselBuilder.kt */
    /* renamed from: tj.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0548a extends kotlin.jvm.internal.k implements ss.a<String> {
        public C0548a() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" buildAutoStartCarousel() : Building auto start carousel.", a.this.f33044e);
        }
    }

    /* compiled from: CarouselBuilder.kt */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ uj.a f33053v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(uj.a aVar) {
            super(0);
            this.f33053v = aVar;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f33044e + " buildAutoStartCarousel() : Building Card: " + this.f33053v;
        }
    }

    /* compiled from: CarouselBuilder.kt */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.x<Bitmap> f33055v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(kotlin.jvm.internal.x<Bitmap> xVar) {
            super(0);
            this.f33055v = xVar;
        }

        @Override // ss.a
        public final String invoke() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f33044e);
            sb2.append(" buildAutoStartCarousel() : Image Dimensions: Height: ");
            kotlin.jvm.internal.x<Bitmap> xVar = this.f33055v;
            sb2.append(xVar.f23469u.getHeight());
            sb2.append(" Width: ");
            sb2.append(xVar.f23469u.getWidth());
            return sb2.toString();
        }
    }

    /* compiled from: CarouselBuilder.kt */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.k implements ss.a<String> {
        public d() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" downloadAndSaveImages() : Downloading images for template.", a.this.f33044e);
        }
    }

    /* compiled from: CarouselBuilder.kt */
    /* loaded from: classes.dex */
    public static final class e extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int[] f33058v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(int[] iArr) {
            super(0);
            this.f33058v = iArr;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f33044e + " downloadAndSaveImages() : Download complete, success count: " + this.f33058v[0];
        }
    }

    /* compiled from: CarouselBuilder.kt */
    /* loaded from: classes.dex */
    public static final class f extends kotlin.jvm.internal.k implements ss.a<String> {
        public f() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" downloadAndSaveImages() : ", a.this.f33044e);
        }
    }

    /* compiled from: CarouselBuilder.kt */
    /* loaded from: classes.dex */
    public static final class g extends kotlin.jvm.internal.k implements ss.a<String> {
        public g() {
            super(0);
        }

        @Override // ss.a
        public final String invoke() {
            return kotlin.jvm.internal.i.n(" removeFailedImagesFromPayload() : Will remove failed images from payload.", a.this.f33044e);
        }
    }

    /* compiled from: CarouselBuilder.kt */
    /* loaded from: classes.dex */
    public static final class h extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ int f33062v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(int i6) {
            super(0);
            this.f33062v = i6;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f33044e + " removeFailedImagesFromPayload() : Removing card as image download failed. Index: " + this.f33062v;
        }
    }

    /* compiled from: CarouselBuilder.kt */
    /* loaded from: classes.dex */
    public static final class i extends kotlin.jvm.internal.k implements ss.a<String> {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ JSONObject f33064v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(JSONObject jSONObject) {
            super(0);
            this.f33064v = jSONObject;
        }

        @Override // ss.a
        public final String invoke() {
            return a.this.f33044e + " removeFailedImagesFromPayload() : Updated Rich push payload: " + this.f33064v;
        }
    }

    public a(Context context, uj.o template, jj.b metaData, ih.p sdkInstance) {
        kotlin.jvm.internal.i.g(context, "context");
        kotlin.jvm.internal.i.g(template, "template");
        kotlin.jvm.internal.i.g(metaData, "metaData");
        kotlin.jvm.internal.i.g(sdkInstance, "sdkInstance");
        this.f33040a = context;
        this.f33041b = template;
        this.f33042c = metaData;
        this.f33043d = sdkInstance;
        this.f33044e = "RichPush_4.3.2_CarouselBuilder";
        this.f = new l0(sdkInstance);
        this.f33045g = new pi.o[]{new pi.o(R.id.card11, R.id.verticalImage11, R.id.horizontalCenterCropImage11, R.id.horizontalCenterCropImage11, 1)};
        this.f33046h = new pi.o[]{new pi.o(R.id.card21, R.id.verticalImage21, R.id.horizontalCenterCropImage21, R.id.horizontalFitCenterImage21, 1), new pi.o(R.id.card22, R.id.verticalImage22, R.id.horizontalCenterCropImage22, R.id.horizontalFitCenterImage22, 1)};
        this.f33047i = new pi.o[]{new pi.o(R.id.card31, R.id.verticalImage31, R.id.horizontalCenterCropImage31, R.id.horizontalFitCenterImage31, 1), new pi.o(R.id.card32, R.id.verticalImage32, R.id.horizontalCenterCropImage32, R.id.horizontalFitCenterImage32, 1), new pi.o(R.id.card33, R.id.verticalImage33, R.id.horizontalCenterCropImage33, R.id.horizontalFitCenterImage33, 1)};
        this.f33048j = new pi.o[]{new pi.o(R.id.card41, R.id.verticalImage41, R.id.horizontalCenterCropImage41, R.id.horizontalFitCenterImage41, 1), new pi.o(R.id.card42, R.id.verticalImage42, R.id.horizontalCenterCropImage42, R.id.horizontalFitCenterImage42, 1), new pi.o(R.id.card43, R.id.verticalImage43, R.id.horizontalCenterCropImage43, R.id.horizontalFitCenterImage43, 1), new pi.o(R.id.card44, R.id.verticalImage44, R.id.horizontalCenterCropImage44, R.id.horizontalFitCenterImage44, 1)};
        this.f33049k = new pi.o[]{new pi.o(R.id.card51, R.id.verticalImage51, R.id.horizontalCenterCropImage51, R.id.horizontalFitCenterImage51, 1), new pi.o(R.id.card52, R.id.verticalImage52, R.id.horizontalCenterCropImage52, R.id.horizontalFitCenterImage52, 1), new pi.o(R.id.card53, R.id.verticalImage53, R.id.horizontalCenterCropImage53, R.id.horizontalFitCenterImage53, 1), new pi.o(R.id.card54, R.id.verticalImage54, R.id.horizontalCenterCropImage54, R.id.horizontalFitCenterImage54, 1), new pi.o(R.id.card55, R.id.verticalImage55, R.id.horizontalCenterCropImage55, R.id.horizontalFitCenterImage55, 1)};
        this.f33050l = new int[]{R.id.marker1, R.id.marker2, R.id.marker3, R.id.marker4, R.id.marker5};
    }

    public static Intent f(Context context, Bundle bundle, int i6, String str, int i10, int i11) {
        Intent intent = new Intent(context, MoERichPushIntentService.class);
        intent.setFlags(268435456);
        intent.putExtras(bundle).putExtra("nav_dir", str).putExtra("image_index", i10).putExtra("image_count", i11).putExtra("MOE_NOTIFICATION_ID", i6);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v3, types: [T, android.graphics.Bitmap] */
    /* JADX WARN: Type inference failed for: r12v4, types: [T, android.graphics.Bitmap] */
    public final void a(RemoteViews remoteViews, int i6, List<uj.a> list) {
        int i10;
        pi.o[] oVarArr;
        boolean z10;
        int i11;
        ih.p pVar = this.f33043d;
        int i12 = 0;
        int i13 = 3;
        hh.g.b(pVar.f20105d, 0, new C0548a(), 3);
        if (i6 != 1) {
            if (i6 != 2) {
                if (i6 != 3) {
                    if (i6 != 4) {
                        if (i6 == 5) {
                            i10 = R.id.viewFlipperFive;
                            oVarArr = this.f33049k;
                        } else {
                            throw new IllegalStateException("Not a valid state");
                        }
                    } else {
                        i10 = R.id.viewFlipperFour;
                        oVarArr = this.f33048j;
                    }
                } else {
                    i10 = R.id.viewFlipperThree;
                    oVarArr = this.f33047i;
                }
            } else {
                i10 = R.id.viewFlipperTwo;
                oVarArr = this.f33046h;
            }
        } else {
            i10 = R.id.card11;
            oVarArr = this.f33045g;
        }
        pi.o[] oVarArr2 = oVarArr;
        remoteViews.setViewVisibility(i10, 0);
        Context context = this.f33040a;
        vj.a aVar = new vj.a(context, pVar);
        int i14 = 0;
        int i15 = 0;
        while (i15 < oVarArr2.length && i14 < list.size()) {
            uj.a aVar2 = list.get(i14);
            b bVar = new b(aVar2);
            hh.g gVar = pVar.f20105d;
            hh.g.b(gVar, i12, bVar, i13);
            uj.r rVar = aVar2.f34184b.get(i12);
            if (kotlin.jvm.internal.i.b("image", rVar.f34223a)) {
                kotlin.jvm.internal.x xVar = new kotlin.jvm.internal.x();
                ?? a10 = aVar.a(this.f33042c.f22066a.f28527b, rVar.f34225c);
                xVar.f23469u = a10;
                if (a10 == 0) {
                    i14++;
                    i12 = 0;
                } else {
                    xVar.f23469u = this.f.m(context, a10, fj.y.i(192, context));
                    int i16 = fj.y.i(192, context);
                    if (di.b.g(context) == ih.h.TABLET) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i11 = oVarArr2[i15].f28509d;
                    } else if (((Bitmap) xVar.f23469u).getHeight() >= ((Bitmap) xVar.f23469u).getWidth()) {
                        i11 = oVarArr2[i15].f28508c;
                    } else if (((Bitmap) xVar.f23469u).getHeight() >= i16) {
                        i11 = oVarArr2[i15].f28509d;
                    } else {
                        i11 = oVarArr2[i15].f28510e;
                    }
                    hh.g.b(gVar, 0, new c(xVar), 3);
                    remoteViews.setViewVisibility(i11, 0);
                    remoteViews.setImageViewBitmap(i11, (Bitmap) xVar.f23469u);
                    Context context2 = context;
                    this.f.d(this.f33040a, this.f33042c, this.f33041b, remoteViews, (uj.i) rVar, aVar2, i11, oVarArr2[i15].f28507b);
                    i14++;
                    i15++;
                    aVar = aVar;
                    context = context2;
                    pVar = pVar;
                    i12 = 0;
                    i13 = 3;
                }
            } else {
                throw new IllegalStateException("Only image widgets are supported in carousel.".toString());
            }
        }
    }

    public final void b(RemoteViews remoteViews, List<uj.a> list) {
        jj.b bVar = this.f33042c;
        int i6 = bVar.f22066a.f28533i.getInt("image_index", 0);
        pj.b bVar2 = bVar.f22066a;
        int i10 = bVar2.f28533i.getInt("image_count", -1);
        if (i10 != -1 && i6 <= i10) {
            Bundle bundle = bVar2.f28533i;
            bundle.remove("image_index");
            bundle.remove("nav_dir");
            ih.p pVar = this.f33043d;
            Context context = this.f33040a;
            vj.a aVar = new vj.a(context, pVar);
            uj.a aVar2 = list.get(i6);
            uj.r rVar = aVar2.f34184b.get(0);
            if (kotlin.jvm.internal.i.b("image", rVar.f34223a)) {
                Bitmap a10 = aVar.a(bVar2.f28527b, rVar.f34225c);
                if (a10 == null) {
                    return;
                }
                this.f.i(this.f33040a, this.f33042c, this.f33041b, remoteViews, (uj.i) rVar, aVar2, a10);
                if (i10 > 1) {
                    remoteViews.setViewVisibility(R.id.arrowRight, 0);
                    remoteViews.setViewVisibility(R.id.arrowLeft, 0);
                    if (i10 >= 2) {
                        remoteViews.setViewVisibility(R.id.markerLayout, 0);
                        int[] iArr = this.f33050l;
                        if (i10 <= iArr.length) {
                            for (int i11 = 0; i11 < i10; i11++) {
                                remoteViews.setViewVisibility(iArr[i11], 0);
                                remoteViews.setImageViewResource(iArr[i11], R.drawable.moe_rich_push_other_items);
                            }
                            remoteViews.setImageViewResource(iArr[i6], R.drawable.moe_rich_push_current_position);
                        }
                    }
                    remoteViews.setOnClickPendingIntent(R.id.arrowRight, di.b.l(context, di.b.o(), f(this.f33040a, bVar2.f28533i, bVar.f22068c, "next", i6, i10)));
                    remoteViews.setOnClickPendingIntent(R.id.arrowLeft, di.b.l(context, di.b.o(), f(this.f33040a, bVar2.f28533i, bVar.f22068c, "previous", i6, i10)));
                    return;
                }
                return;
            }
            throw new IllegalStateException("Only image widgets support in carousel.".toString());
        }
    }

    public final int c(List<String> list) {
        ih.p pVar = this.f33043d;
        int[] iArr = {0};
        try {
            hh.g.b(pVar.f20105d, 0, new d(), 3);
            ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
            vj.a aVar = new vj.a(this.f33040a, pVar);
            for (String str : list) {
                newCachedThreadPool.submit(new u5.f(this, str, aVar, iArr, 8));
            }
            newCachedThreadPool.shutdown();
            newCachedThreadPool.awaitTermination(10L, TimeUnit.SECONDS);
            hh.g.b(pVar.f20105d, 0, new e(iArr), 3);
        } catch (InterruptedException e10) {
            pVar.f20105d.a(1, e10, new f());
        }
        return iArr[0];
    }

    public final List<String> d() {
        List<uj.a> list;
        uj.o oVar = this.f33041b;
        uj.h hVar = oVar.f34216e;
        if (hVar == null) {
            list = null;
        } else {
            list = hVar.f34198d;
        }
        if (list == null) {
            return is.w.f20676u;
        }
        ArrayList arrayList = new ArrayList(oVar.f34216e.f34198d.size());
        for (uj.a aVar : oVar.f34216e.f34198d) {
            boolean z10 = true;
            if (!aVar.f34184b.isEmpty()) {
                List<uj.r> list2 = aVar.f34184b;
                if (list2.size() > 1) {
                    z10 = false;
                }
                if (z10) {
                    uj.r rVar = list2.get(0);
                    if (kotlin.jvm.internal.i.b("image", rVar.f34223a)) {
                        arrayList.add(rVar.f34225c);
                    } else {
                        throw new IllegalStateException("Widget type should be image.".toString());
                    }
                } else {
                    throw new IllegalStateException("Given card should have only one widget".toString());
                }
            } else {
                throw new IllegalStateException("Widget list should not be empty".toString());
            }
        }
        return arrayList;
    }

    public final RemoteViews e(boolean z10, boolean z11) {
        boolean a10 = sj.z.a();
        Context context = this.f33040a;
        if (a10) {
            if (z11) {
                return new RemoteViews(context.getPackageName(), (int) R.layout.moe_rich_push_simple_carousel_decorated_style_expanded_view_with_dismiss_cta_layout);
            }
            return new RemoteViews(context.getPackageName(), (int) R.layout.moe_rich_push_simple_carousel_decorated_style_expanded_view_without_dismiss_cta_layout);
        }
        ih.p pVar = this.f33043d;
        if (z10) {
            return new RemoteViews(context.getPackageName(), sj.z.c(R.layout.moe_rich_push_simple_carousel_auto_start_expanded_view, R.layout.moe_rich_push_simple_carousel_auto_start_expanded_view_layout_big, pVar));
        }
        return new RemoteViews(context.getPackageName(), sj.z.c(R.layout.moe_rich_push_simple_carousel_manual_expanded_view, R.layout.moe_rich_push_simple_carousel_manual_expanded_view_layout_big, pVar));
    }

    public final void g() {
        int i6;
        boolean z10;
        ih.p pVar = this.f33043d;
        hh.g.b(pVar.f20105d, 0, new g(), 3);
        jj.b bVar = this.f33042c;
        String string = bVar.f22066a.f28533i.getString("moeFeatures");
        if (string == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject(string);
        JSONObject jSONObject2 = jSONObject.getJSONObject("richPush");
        JSONObject jSONObject3 = jSONObject2.getJSONObject("expanded");
        JSONArray jSONArray = jSONObject3.getJSONArray("cards");
        JSONArray jSONArray2 = new JSONArray();
        vj.a aVar = new vj.a(this.f33040a, pVar);
        ArrayList arrayList = new ArrayList();
        uj.o oVar = this.f33041b;
        uj.h hVar = oVar.f34216e;
        kotlin.jvm.internal.i.d(hVar);
        int size = hVar.f34198d.size();
        int i10 = 0;
        while (true) {
            hh.g gVar = pVar.f20105d;
            pj.b bVar2 = bVar.f22066a;
            ih.p pVar2 = pVar;
            uj.h hVar2 = oVar.f34216e;
            if (i10 < size) {
                int i11 = i10 + 1;
                uj.a aVar2 = hVar2.f34198d.get(i10);
                String campaignId = bVar2.f28527b;
                uj.o oVar2 = oVar;
                jj.b bVar3 = bVar;
                String imageUrl = aVar2.f34184b.get(0).f34225c;
                kotlin.jvm.internal.i.g(campaignId, "campaignId");
                kotlin.jvm.internal.i.g(imageUrl, "imageUrl");
                try {
                    z10 = aVar.f35231c.e(campaignId, di.b.i(imageUrl));
                    i6 = size;
                } catch (NoSuchAlgorithmException e10) {
                    i6 = size;
                    aVar.f35229a.f20105d.a(1, e10, new vj.b(aVar));
                    z10 = false;
                }
                if (z10) {
                    jSONArray2.put(jSONArray.getJSONObject(i10));
                    arrayList.add(aVar2);
                } else {
                    hh.g.b(gVar, 0, new h(i10), 3);
                }
                pVar = pVar2;
                i10 = i11;
                oVar = oVar2;
                bVar = bVar3;
                size = i6;
            } else {
                hVar2.getClass();
                hVar2.f34198d = arrayList;
                jSONObject3.put("cards", jSONArray2);
                jSONObject2.put("expanded", jSONObject3);
                hh.g.b(gVar, 0, new i(jSONObject2), 3);
                jSONObject.put("richPush", jSONObject2);
                bVar2.f28533i.putString("moeFeatures", jSONObject.toString());
                return;
            }
        }
    }
}
