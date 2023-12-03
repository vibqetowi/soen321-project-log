package ni;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.moengage.inapp.internal.exceptions.CouldNotCreateViewException;
import com.moengage.inapp.internal.exceptions.ImageNotFoundException;
import com.moengage.widgets.MoERatingBar;
import he.e0;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import nd.z;
/* compiled from: ViewEngine.java */
/* loaded from: classes.dex */
public final class x extends ni.a {

    /* renamed from: c  reason: collision with root package name */
    public final pi.m f26363c;

    /* renamed from: d  reason: collision with root package name */
    public final Context f26364d;

    /* renamed from: e  reason: collision with root package name */
    public final vi.c f26365e;
    public final e0 f;

    /* renamed from: g  reason: collision with root package name */
    public RelativeLayout f26366g;

    /* renamed from: h  reason: collision with root package name */
    public final int f26367h;

    /* renamed from: i  reason: collision with root package name */
    public final float f26368i;

    /* renamed from: j  reason: collision with root package name */
    public int f26369j;

    /* renamed from: k  reason: collision with root package name */
    public final Activity f26370k;

    /* renamed from: l  reason: collision with root package name */
    public RelativeLayout f26371l;

    /* renamed from: m  reason: collision with root package name */
    public final ih.p f26372m;

    /* renamed from: n  reason: collision with root package name */
    public final kotlinx.coroutines.e0 f26373n;

    /* compiled from: ViewEngine.java */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: u  reason: collision with root package name */
        public final /* synthetic */ List f26374u;

        public a(List list) {
            this.f26374u = list;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            x xVar = x.this;
            Activity activity = xVar.f26370k;
            ih.p pVar = xVar.f26372m;
            mi.a aVar = new mi.a(activity, pVar);
            for (bj.a aVar2 : this.f26374u) {
                pVar.f20105d.a(5, null, new u(3, aVar2));
                aVar.K(xVar.f26371l, xVar.f26363c, aVar2);
            }
        }
    }

    public x(Activity activity, ih.p pVar, pi.m mVar, i5.n nVar) {
        super(activity, mVar, nVar);
        this.f26373n = new kotlinx.coroutines.e0(11);
        this.f26370k = activity;
        this.f26372m = pVar;
        this.f26364d = activity.getApplicationContext();
        this.f26363c = mVar;
        this.f26365e = new vi.c(activity.getApplicationContext(), pVar);
        this.f = (e0) nVar.f19877v;
        this.f26367h = nVar.f19876u;
        this.f26368i = activity.getResources().getDisplayMetrics().density;
    }

    public static int g(pi.f fVar) {
        return Color.argb((int) ((fVar.f28466d * 255.0f) + 0.5f), fVar.f28463a, fVar.f28464b, fVar.f28465c);
    }

    public static e0 h(View view) {
        view.measure(0, 0);
        return new e0(view.getMeasuredWidth(), view.getMeasuredHeight(), 1);
    }

    public static int n(double d10, int i6) {
        return (int) ((d10 * i6) / 100.0d);
    }

    public final void b(View view, List<bj.a> list) {
        ih.p pVar = this.f26372m;
        if (list == null) {
            pVar.f20105d.a(5, null, new r(4));
            return;
        }
        pVar.f20105d.a(5, null, new u(0, list));
        view.setOnClickListener(new a(list));
    }

    public final void c(RelativeLayout.LayoutParams layoutParams, ui.e eVar) {
        int n10;
        int n11;
        int n12;
        pi.l lVar = eVar.f34174c;
        double d10 = lVar.f28489a;
        int i6 = 0;
        e0 e0Var = this.f;
        if (d10 == 0.0d) {
            n10 = 0;
        } else {
            n10 = n(d10, e0Var.f17480b);
        }
        layoutParams.leftMargin = n10;
        double d11 = lVar.f28490b;
        if (d11 == 0.0d) {
            n11 = 0;
        } else {
            n11 = n(d11, e0Var.f17480b);
        }
        layoutParams.rightMargin = n11;
        double d12 = lVar.f28491c;
        if (d12 == 0.0d) {
            n12 = 0;
        } else {
            n12 = n(d12, e0Var.f17481c);
        }
        layoutParams.topMargin = n12;
        double d13 = lVar.f28492d;
        if (d13 != 0.0d) {
            i6 = n(d13, e0Var.f17481c);
        }
        layoutParams.bottomMargin = i6;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x01e8, code lost:
        throw new com.moengage.inapp.internal.exceptions.ImageNotFoundException("Gif Download failure");
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04d8 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r17v0, types: [ni.x] */
    /* JADX WARN: Type inference failed for: r1v10, types: [android.widget.TextView, android.view.View] */
    /* JADX WARN: Type inference failed for: r1v6, types: [android.widget.TextView, android.widget.Button, android.view.View] */
    /* JADX WARN: Type inference failed for: r8v26, types: [com.moengage.widgets.MoERatingBar, android.widget.RatingBar, android.view.View] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LinearLayout d(final pi.i iVar) {
        pi.f fVar;
        pi.f fVar2;
        LinearLayout linearLayout;
        int i6;
        pi.k kVar;
        pi.f fVar3;
        LinearLayout linearLayout2;
        pi.f fVar4;
        int i10;
        Context context = this.f26364d;
        LinearLayout linearLayout3 = new LinearLayout(context);
        int i11 = iVar.f28481d;
        int d10 = v.h.d(i11);
        final int i12 = 0;
        int i13 = 1;
        if (d10 != 0) {
            if (d10 == 1) {
                linearLayout3.setOrientation(1);
            }
        } else {
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(1);
        }
        Iterator<pi.q> it = iVar.f.iterator();
        Throwable th2 = null;
        LinearLayout linearLayout4 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            ih.p pVar = this.f26372m;
            if (hasNext) {
                pi.q next = it.next();
                int d11 = v.h.d(next.f28515a);
                vd.a aVar = next.f28516b;
                if (d11 != 0) {
                    if (d11 == i13) {
                        final pi.i iVar2 = (pi.i) aVar;
                        if (!iVar2.f28480c.f34176e) {
                            pVar.f20105d.a(5, th2, new ss.a() { // from class: ni.v
                                @Override // ss.a
                                public final Object invoke() {
                                    int i14 = i12;
                                    pi.i iVar3 = iVar2;
                                    switch (i14) {
                                        case 0:
                                            return "InApp_6.5.0_ViewEngine createContainer() : Display type of container is false. Will not create container. " + iVar3;
                                        default:
                                            return "InApp_6.5.0_ViewEngine createContainer() : " + iVar3.f28480c;
                                    }
                                }
                            });
                        } else {
                            linearLayout4 = d(iVar2);
                        }
                    }
                    linearLayout = linearLayout3;
                    if (linearLayout4 == null) {
                        LinearLayout linearLayout5 = linearLayout;
                        linearLayout5.addView(linearLayout4);
                        linearLayout3 = linearLayout5;
                        i12 = 0;
                        i13 = 1;
                        th2 = null;
                    } else {
                        throw new CouldNotCreateViewException("One of the container/widget creation wasn't successful cannot create view further");
                    }
                } else {
                    pi.k kVar2 = (pi.k) aVar;
                    if (!((ui.e) kVar2.f28487d.f26149c).f34176e) {
                        pVar.f20105d.a(5, th2, new t(kVar2, i13));
                    } else {
                        pVar.f20105d.a(5, th2, new t(kVar2, 2));
                        int i14 = kVar2.f28486c;
                        int d12 = v.h.d(i14);
                        Activity activity = this.f26370k;
                        hh.g gVar = pVar.f20105d;
                        z zVar = kVar2.f28487d;
                        if (d12 != 0) {
                            if (d12 != i13) {
                                if (d12 != 2) {
                                    if (d12 != 3) {
                                        linearLayout = linearLayout3;
                                        i6 = i14;
                                        kVar = kVar2;
                                        linearLayout2 = null;
                                    } else {
                                        gVar.a(5, null, new t(kVar2, 4));
                                        ?? moERatingBar = new MoERatingBar(context);
                                        moERatingBar.setIsIndicator(false);
                                        ui.f fVar5 = (ui.f) ((ui.e) zVar.f26149c);
                                        moERatingBar.setNumStars(fVar5.f34178h);
                                        if (fVar5.f34179i) {
                                            moERatingBar.setStepSize(0.5f);
                                        } else {
                                            moERatingBar.setStepSize(1.0f);
                                        }
                                        moERatingBar.setColor(g(fVar5.f34177g));
                                        linearLayout = linearLayout3;
                                        e0 e0Var = new e0(i(fVar5).f17480b, (int) (fVar5.f34180j * this.f26368i), 1);
                                        gVar.a(5, null, new p(e0Var, 10));
                                        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(e0Var.f17480b, e0Var.f17481c);
                                        if (2 == i11) {
                                            layoutParams.gravity = 1;
                                        }
                                        pi.o l2 = l(fVar5.f34174c);
                                        layoutParams.setMargins(l2.f28507b, l2.f28509d, l2.f28508c, l2.f28510e);
                                        moERatingBar.setLayoutParams(layoutParams);
                                        GradientDrawable gradientDrawable = new GradientDrawable();
                                        pi.b bVar = fVar5.f;
                                        if (bVar != null) {
                                            f(bVar, gradientDrawable);
                                        }
                                        moERatingBar.setBackground(gradientDrawable);
                                        linearLayout2 = moERatingBar;
                                        i6 = i14;
                                        kVar = kVar2;
                                    }
                                } else {
                                    linearLayout = linearLayout3;
                                    gVar.a(5, null, new t(kVar2, 3));
                                    ui.d dVar = (ui.d) ((ui.e) zVar.f26149c);
                                    if (di.b.r((String) zVar.f26148b) && !di.n.d()) {
                                        gVar.a(2, null, new r(5));
                                        throw new UnsupportedOperationException("library not support gif not added.");
                                    }
                                    ImageView imageView = new ImageView(context);
                                    boolean r = di.b.r((String) zVar.f26148b);
                                    pi.m mVar = this.f26363c;
                                    vi.c cVar = this.f26365e;
                                    if (r) {
                                        File b10 = cVar.b((String) zVar.f26148b, mVar.f28493h);
                                        if (b10 == null || !b10.exists()) {
                                            break;
                                        }
                                        gVar.a(5, null, new u(1, dVar));
                                        e0 i15 = i(dVar);
                                        gVar.a(5, null, new p(i15, 5));
                                        i6 = i14;
                                        kVar = kVar2;
                                        i15.f17481c = (int) ((dVar.f34170g * i15.f17480b) / dVar.f34171h);
                                        gVar.a(5, null, new p(i15, 6));
                                        imageView.setLayoutParams(new LinearLayout.LayoutParams(i15.f17480b, i15.f17481c));
                                        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                                        new Handler(Looper.getMainLooper()).post(new s(this, b10, imageView, 1));
                                    } else {
                                        i6 = i14;
                                        kVar = kVar2;
                                        Bitmap c10 = cVar.c(context, (String) zVar.f26148b, mVar.f28493h);
                                        if (c10 != null) {
                                            e0 i16 = i((ui.e) zVar.f26149c);
                                            gVar.a(5, null, new p(i16, 7));
                                            e0 e0Var2 = new e0(c10.getWidth(), c10.getHeight(), 1);
                                            gVar.a(5, null, new p(e0Var2, 8));
                                            i16.f17481c = (e0Var2.f17481c * i16.f17480b) / e0Var2.f17480b;
                                            gVar.a(5, null, new p(i16, 9));
                                            imageView.setLayoutParams(new LinearLayout.LayoutParams(i16.f17480b, i16.f17481c));
                                            imageView.setImageBitmap(Bitmap.createScaledBitmap(c10, i16.f17480b, i16.f17481c, true));
                                        } else {
                                            throw new ImageNotFoundException("Image Download failure");
                                        }
                                    }
                                    pi.o m10 = m(dVar.f34175d);
                                    imageView.setPadding(m10.f28507b, m10.f28509d, m10.f28508c, m10.f28510e);
                                    LinearLayout linearLayout6 = new LinearLayout(context);
                                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(imageView.getLayoutParams().width, imageView.getLayoutParams().height);
                                    pi.o l10 = l(dVar.f34174c);
                                    int i17 = l10.f28507b;
                                    int i18 = l10.f28509d;
                                    int i19 = l10.f28508c;
                                    int i20 = l10.f28510e;
                                    layoutParams2.setMargins(i17, i18, i19, i20);
                                    layoutParams2.leftMargin = i17;
                                    layoutParams2.rightMargin = i19;
                                    layoutParams2.topMargin = i18;
                                    layoutParams2.bottomMargin = i20;
                                    if (2 == i11) {
                                        layoutParams2.gravity = 1;
                                    }
                                    linearLayout6.setLayoutParams(layoutParams2);
                                    pi.b bVar2 = dVar.f;
                                    if (bVar2 != null) {
                                        i10 = (int) TypedValue.applyDimension(1, (float) bVar2.f28445c, activity.getResources().getDisplayMetrics());
                                    } else {
                                        i10 = 0;
                                    }
                                    linearLayout6.setPadding(i10, i10, i10, i10);
                                    if (bVar2 != null) {
                                        GradientDrawable gradientDrawable2 = new GradientDrawable();
                                        f(bVar2, gradientDrawable2);
                                        linearLayout6.setBackground(gradientDrawable2);
                                    }
                                    linearLayout6.addView(imageView);
                                    linearLayout2 = linearLayout6;
                                }
                            } else {
                                linearLayout = linearLayout3;
                                i6 = i14;
                                kVar = kVar2;
                                gVar.a(5, null, new t(kVar, 6));
                                ?? textView = new TextView(context);
                                textView.setText((String) zVar.f26148b);
                                textView.setAllCaps(false);
                                ui.g gVar2 = (ui.g) ((ui.e) zVar.f26149c);
                                textView.setTextSize(gVar2.f.f28468b);
                                pi.g gVar3 = gVar2.f;
                                pi.f fVar6 = gVar3.f28469c;
                                if (fVar6 != null) {
                                    textView.setTextColor(g(fVar6));
                                }
                                int identifier = context.getResources().getIdentifier(gVar3.f28467a, "font", context.getPackageName());
                                if (identifier > 0) {
                                    textView.setTypeface(i0.f.b(identifier, context));
                                }
                                e0 i21 = i((ui.e) zVar.f26149c);
                                gVar.a(5, null, new p(i21, 14));
                                i21.f17481c = -2;
                                pi.o m11 = m(gVar2.f34175d);
                                gVar.a(5, null, new q(m11, 3));
                                textView.setPadding(m11.f28507b, m11.f28509d, m11.f28508c, m11.f28510e);
                                gVar.a(5, null, new p(i21, 15));
                                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(i21.f17480b, i21.f17481c);
                                if (2 == i11) {
                                    layoutParams3.gravity = 1;
                                }
                                pi.o l11 = l(gVar2.f34174c);
                                layoutParams3.setMargins(l11.f28507b, l11.f28509d, l11.f28508c, l11.f28510e);
                                textView.setLayoutParams(layoutParams3);
                                GradientDrawable gradientDrawable3 = new GradientDrawable();
                                z zVar2 = gVar2.f34181g;
                                if (zVar2 != null && (fVar4 = (pi.f) zVar2.f26149c) != null) {
                                    gradientDrawable3.setColor(g(fVar4));
                                }
                                pi.b bVar3 = gVar2.f34182h;
                                if (bVar3 != null) {
                                    f(bVar3, gradientDrawable3);
                                }
                                textView.setBackground(gradientDrawable3);
                                textView.setGravity(17);
                                linearLayout2 = textView;
                            }
                        } else {
                            linearLayout = linearLayout3;
                            i6 = i14;
                            kVar = kVar2;
                            gVar.a(5, null, new t(kVar, 5));
                            ?? button = new Button(context);
                            button.setText((String) zVar.f26148b);
                            button.setAllCaps(false);
                            ui.a aVar2 = (ui.a) ((ui.e) zVar.f26149c);
                            gVar.a(5, null, new u(2, aVar2));
                            button.setTextSize(aVar2.f.f28468b);
                            pi.g gVar4 = aVar2.f;
                            pi.f fVar7 = gVar4.f28469c;
                            if (fVar7 != null) {
                                button.setTextColor(g(fVar7));
                            }
                            int identifier2 = context.getResources().getIdentifier(gVar4.f28467a, "font", context.getPackageName());
                            if (identifier2 > 0) {
                                button.setTypeface(i0.f.b(identifier2, context));
                            }
                            e0 i22 = i((ui.e) zVar.f26149c);
                            gVar.a(5, null, new p(i22, 11));
                            pi.o m12 = m(aVar2.f34175d);
                            gVar.a(5, null, new q(m12, 2));
                            button.setPadding(m12.f28507b, m12.f28509d, m12.f28508c, m12.f28510e);
                            e0 h10 = h(button);
                            gVar.a(5, null, new p(h10, 12));
                            final int applyDimension = (int) TypedValue.applyDimension(1, aVar2.f34167i, activity.getResources().getDisplayMetrics());
                            gVar.a(5, null, new ss.a() { // from class: ni.w
                                @Override // ss.a
                                public final Object invoke() {
                                    return "InApp_6.5.0_ViewEngine createButton() : Minimum height for widget: " + applyDimension;
                                }
                            });
                            if (applyDimension > h10.f17481c) {
                                i22.f17481c = applyDimension;
                            }
                            gVar.a(5, null, new p(i22, 13));
                            LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(i22.f17480b, i22.f17481c);
                            if (2 == i11) {
                                layoutParams4.gravity = 1;
                            }
                            pi.o l12 = l(aVar2.f34174c);
                            layoutParams4.setMargins(l12.f28507b, l12.f28509d, l12.f28508c, l12.f28510e);
                            button.setLayoutParams(layoutParams4);
                            GradientDrawable gradientDrawable4 = new GradientDrawable();
                            z zVar3 = aVar2.f34181g;
                            if (zVar3 != null && (fVar3 = (pi.f) zVar3.f26149c) != null) {
                                gradientDrawable4.setColor(g(fVar3));
                            }
                            pi.b bVar4 = aVar2.f34182h;
                            if (bVar4 != null) {
                                f(bVar4, gradientDrawable4);
                            }
                            button.setBackground(gradientDrawable4);
                            button.setGravity(17);
                            linearLayout2 = button;
                        }
                        if (linearLayout2 != null) {
                            linearLayout2.setId(kVar.f34976b + 30000);
                            linearLayout2.setClickable(true);
                            b(linearLayout2, kVar.f28488e);
                            linearLayout4 = linearLayout2;
                            if (linearLayout4 == null) {
                            }
                        } else {
                            throw new CouldNotCreateViewException("View type not recognised. Type ".concat(pl.a.k(i6)));
                        }
                    }
                }
            } else {
                LinearLayout linearLayout7 = linearLayout3;
                pVar.f20105d.a(5, null, new ss.a() { // from class: ni.v
                    @Override // ss.a
                    public final Object invoke() {
                        int i142 = i12;
                        pi.i iVar3 = iVar;
                        switch (i142) {
                            case 0:
                                return "InApp_6.5.0_ViewEngine createContainer() : Display type of container is false. Will not create container. " + iVar3;
                            default:
                                return "InApp_6.5.0_ViewEngine createContainer() : " + iVar3.f28480c;
                        }
                    }
                });
                ui.e eVar = iVar.f28480c;
                e0 i23 = i(eVar);
                p pVar2 = new p(i23, 3);
                hh.g gVar5 = pVar.f20105d;
                gVar5.a(5, null, pVar2);
                e0 h11 = h(linearLayout7);
                gVar5.a(5, null, new p(h11, 4));
                i23.f17481c = Math.max(i23.f17481c, h11.f17481c);
                linearLayout7.setLayoutParams(new RelativeLayout.LayoutParams(i23.f17480b, i23.f17481c));
                int i24 = this.f26369j;
                int i25 = iVar.f34976b;
                if (i24 != i25) {
                    RelativeLayout.LayoutParams layoutParams5 = (RelativeLayout.LayoutParams) linearLayout7.getLayoutParams();
                    c(layoutParams5, eVar);
                    linearLayout7.setLayoutParams(layoutParams5);
                    pi.o m13 = m(eVar.f34175d);
                    linearLayout7.setPadding(m13.f28507b, m13.f28509d, m13.f28508c, m13.f28510e);
                    ui.c cVar2 = (ui.c) eVar;
                    z zVar4 = cVar2.f34168g;
                    if (zVar4 != null && (fVar2 = (pi.f) zVar4.f26149c) != null) {
                        linearLayout7.setBackgroundColor(g(fVar2));
                    }
                    pi.b bVar5 = cVar2.f;
                    if (bVar5 != null) {
                        GradientDrawable gradientDrawable5 = new GradientDrawable();
                        f(bVar5, gradientDrawable5);
                        z zVar5 = cVar2.f34168g;
                        if (zVar5 != null && (fVar = (pi.f) zVar5.f26149c) != null) {
                            gradientDrawable5.setColor(g(fVar));
                        }
                        linearLayout7.setBackground(gradientDrawable5);
                    }
                }
                linearLayout7.setId(i25 + 20000);
                return linearLayout7;
            }
        }
    }

    public final RelativeLayout e(pi.i iVar) {
        pi.q qVar;
        pi.q qVar2;
        ui.e eVar;
        String str;
        float f;
        pi.o oVar;
        ih.p pVar = this.f26372m;
        pVar.f20105d.a(5, null, new xg.i(29));
        Context context = this.f26364d;
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setId(iVar.f34976b + 20000);
        ArrayList<pi.q> arrayList = iVar.f;
        Iterator<pi.q> it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                qVar = it.next();
                if (qVar.f28515a == 2) {
                    break;
                }
            } else {
                qVar = null;
                break;
            }
        }
        if (qVar != null) {
            pi.i iVar2 = (pi.i) qVar.f28516b;
            RelativeLayout relativeLayout2 = new RelativeLayout(context);
            this.f26369j = iVar2.f34976b;
            LinearLayout d10 = d(iVar2);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
            ui.e eVar2 = iVar2.f28480c;
            c(layoutParams, eVar2);
            relativeLayout2.setLayoutParams(layoutParams);
            e0 e0Var = new e0(i(eVar2).f17480b, h(d10).f17481c, 1);
            p pVar2 = new p(e0Var, 2);
            hh.g gVar = pVar.f20105d;
            gVar.a(5, null, pVar2);
            k(relativeLayout2, (ui.c) eVar2, e0Var);
            relativeLayout2.addView(d10);
            pi.m mVar = this.f26363c;
            int i6 = mVar.f28501p;
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) relativeLayout2.getLayoutParams();
            layoutParams2.addRule(15);
            layoutParams2.addRule(14);
            relativeLayout2.setLayoutParams(layoutParams2);
            relativeLayout2.setId(12345);
            this.f26366g = relativeLayout2;
            relativeLayout.addView(relativeLayout2);
            Iterator<pi.q> it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    qVar2 = it2.next();
                    if (qVar2.f28515a == 1) {
                        break;
                    }
                } else {
                    qVar2 = null;
                    break;
                }
            }
            if (qVar2 != null) {
                pi.k kVar = (pi.k) qVar2.f28516b;
                if (kVar.f28486c == 5) {
                    ui.e eVar3 = iVar.f28480c;
                    e0 i10 = i(eVar3);
                    gVar.a(5, null, new p(i10, 0));
                    e0 h10 = h(relativeLayout);
                    gVar.a(5, null, new p(h10, 1));
                    i10.f17481c = Math.max(i10.f17481c, h10.f17481c);
                    z zVar = kVar.f28487d;
                    boolean z10 = ((ui.e) zVar.f26149c).f34176e;
                    String str2 = mVar.f28495j;
                    if (z10) {
                        gVar.a(5, null, new t(kVar, 0));
                        vi.c cVar = this.f26365e;
                        String str3 = mVar.f28493h;
                        Bitmap c10 = cVar.c(context, (String) zVar.f26148b, str3);
                        if (c10 == null) {
                            c10 = BitmapFactory.decodeResource(context.getResources(), context.getResources().getIdentifier("moe_close", "drawable", context.getPackageName()));
                        }
                        ImageView imageView = new ImageView(context);
                        float f2 = this.f26368i;
                        int i11 = (int) (42.0f * f2);
                        e0 e0Var2 = new e0(i11, Math.min(i11, i10.f17481c), 1);
                        if (str2.equals("EMBEDDED")) {
                            f = 16.0f;
                        } else {
                            f = 24.0f;
                        }
                        int i12 = (int) (f * f2);
                        eVar = eVar3;
                        e0 e0Var3 = new e0(i12, i12, 1);
                        imageView.setImageBitmap(Bitmap.createScaledBitmap(c10, e0Var3.f17480b, e0Var3.f17481c, true));
                        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(e0Var2.f17480b, e0Var2.f17481c);
                        if (str2.equals("EMBEDDED")) {
                            int i13 = (int) (14.0f * f2);
                            oVar = new pi.o(i13, 0, 0, i13, 0);
                        } else {
                            int i14 = (int) (6.0f * f2);
                            oVar = new pi.o(i14, i14, i14, i14, 0);
                        }
                        imageView.setPadding(oVar.f28507b, oVar.f28509d, oVar.f28508c, oVar.f28510e);
                        imageView.setLayoutParams(layoutParams3);
                        imageView.setClickable(true);
                        b(imageView, kVar.f28488e);
                        ui.b bVar = (ui.b) ((ui.e) zVar.f26149c);
                        if (bVar.f != 0) {
                            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) imageView.getLayoutParams();
                            int d11 = v.h.d(bVar.f);
                            e0 e0Var4 = this.f;
                            pi.l lVar = bVar.f34174c;
                            if (d11 != 0) {
                                if (d11 != 1) {
                                    str = str2;
                                } else if (str2.equals("POP_UP")) {
                                    layoutParams4.rightMargin = (int) ((n(lVar.f28490b, e0Var4.f17480b) - (f2 * 21.0f)) + layoutParams4.rightMargin);
                                    layoutParams4.addRule(6, this.f26366g.getId());
                                    layoutParams4.addRule(7, this.f26366g.getId());
                                    str = str2;
                                } else {
                                    str = str2;
                                    if ("EMBEDDED".equals(str)) {
                                        layoutParams4.addRule(6, this.f26366g.getId());
                                        layoutParams4.addRule(7, this.f26366g.getId());
                                    } else {
                                        layoutParams4.addRule(11);
                                    }
                                }
                            } else {
                                str = str2;
                                if (str.equals("POP_UP")) {
                                    layoutParams4.addRule(6, this.f26366g.getId());
                                    layoutParams4.addRule(5, this.f26366g.getId());
                                    layoutParams4.leftMargin = (int) ((n(lVar.f28489a, e0Var4.f17480b) - (f2 * 21.0f)) + layoutParams4.leftMargin);
                                } else if ("EMBEDDED".equals(str)) {
                                    layoutParams4.addRule(6, this.f26366g.getId());
                                    layoutParams4.addRule(5, this.f26366g.getId());
                                } else {
                                    layoutParams4.addRule(9);
                                }
                            }
                            if (str.equals("POP_UP")) {
                                layoutParams4.topMargin -= (int) (f2 * 21.0f);
                            }
                            imageView.setLayoutParams(layoutParams4);
                            relativeLayout.addView(imageView);
                        } else {
                            throw new CouldNotCreateViewException("Cannot create in-app position of close button is missing Campaign-id:" + str3);
                        }
                    } else {
                        eVar = eVar3;
                        str = str2;
                    }
                    RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(i10.f17480b, -1);
                    ui.e eVar4 = eVar;
                    pi.o l2 = l(eVar4.f34174c);
                    if (str.equals("POP_UP") || str.equals("FULL_SCREEN")) {
                        l2 = new pi.o(l2.f28507b, l2.f28508c, l2.f28509d + this.f26367h, l2.f28510e, 0);
                    }
                    layoutParams5.setMargins(l2.f28507b, l2.f28509d, l2.f28508c, l2.f28510e);
                    relativeLayout.setLayoutParams(layoutParams5);
                    pi.o m10 = m(eVar4.f34175d);
                    relativeLayout.setPadding(m10.f28507b, m10.f28509d, m10.f28508c, m10.f28510e);
                    k(relativeLayout, (ui.c) eVar4, i10);
                    return relativeLayout;
                }
                throw new IllegalStateException("Unexpected Widget type. Expected widget type is close button.");
            }
            throw new IllegalStateException("Unexpected Widget type");
        }
        throw new IllegalStateException("Unexpected Widget type");
    }

    public final void f(pi.b bVar, GradientDrawable gradientDrawable) {
        double d10 = bVar.f28444b;
        float f = this.f26368i;
        if (d10 != 0.0d) {
            gradientDrawable.setCornerRadius(((float) d10) * f);
        }
        pi.f fVar = bVar.f28443a;
        if (fVar != null) {
            double d11 = bVar.f28445c;
            if (d11 != 0.0d) {
                gradientDrawable.setStroke((int) (d11 * f), g(fVar));
            }
        }
    }

    public final e0 i(ui.e eVar) {
        int n10;
        double d10 = eVar.f34173b;
        e0 e0Var = this.f;
        int n11 = n(d10, e0Var.f17480b);
        double d11 = eVar.f34172a;
        if (d11 == -2.0d) {
            n10 = -2;
        } else {
            n10 = n(d11, e0Var.f17481c);
        }
        return new e0(n11, n10, 1);
    }

    public final void j(View view) {
        ih.p pVar = this.f26372m;
        pVar.f20105d.a(5, null, new xg.i(27));
        if (this.f26363c.f28495j.equals("EMBEDDED")) {
            pVar.f20105d.a(5, null, new xg.i(28));
            return;
        }
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.requestFocus();
        view.setOnKeyListener(new b(this, 1));
    }

    public final void k(RelativeLayout relativeLayout, ui.c cVar, e0 e0Var) {
        int i6;
        if (cVar.f34168g == null) {
            return;
        }
        pi.b bVar = cVar.f;
        if (bVar != null) {
            i6 = (int) (((int) bVar.f28445c) * this.f26368i);
        } else {
            i6 = 0;
        }
        if (i6 != 0) {
            int paddingLeft = relativeLayout.getPaddingLeft();
            int paddingRight = relativeLayout.getPaddingRight();
            relativeLayout.setPadding(paddingLeft + i6, relativeLayout.getPaddingTop() + i6, paddingRight + i6, relativeLayout.getPaddingBottom() + i6);
        }
        z zVar = cVar.f34168g;
        if (((String) zVar.f26148b) != null) {
            Context context = this.f26364d;
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new RelativeLayout.LayoutParams(e0Var.f17480b, e0Var.f17481c));
            if (di.b.r((String) zVar.f26148b) && !di.n.d()) {
                this.f26372m.f20105d.a(2, null, new r(0));
                throw new UnsupportedOperationException("library not support gif not added.");
            }
            boolean r = di.b.r((String) zVar.f26148b);
            pi.m mVar = this.f26363c;
            vi.c cVar2 = this.f26365e;
            if (r) {
                File b10 = cVar2.b((String) zVar.f26148b, mVar.f28493h);
                if (b10 != null && b10.exists()) {
                    bh.b.f4298b.post(new s(this, b10, imageView, 0));
                } else {
                    throw new ImageNotFoundException("Gif Download failure");
                }
            } else {
                Bitmap c10 = cVar2.c(context, (String) zVar.f26148b, mVar.f28493h);
                if (c10 != null) {
                    imageView.setImageBitmap(c10);
                    imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                } else {
                    throw new ImageNotFoundException("Image Download failure");
                }
            }
            relativeLayout.addView(imageView);
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        pi.f fVar = (pi.f) zVar.f26149c;
        if (fVar != null) {
            gradientDrawable.setColor(g(fVar));
        }
        if (bVar != null) {
            f(bVar, gradientDrawable);
        }
        relativeLayout.setBackground(gradientDrawable);
    }

    public final pi.o l(pi.l lVar) {
        int n10;
        int n11;
        int n12;
        int n13;
        double d10 = lVar.f28489a;
        e0 e0Var = this.f;
        if (d10 == 0.0d) {
            n10 = 0;
        } else {
            n10 = n(d10, e0Var.f17480b);
        }
        double d11 = lVar.f28490b;
        if (d11 == 0.0d) {
            n11 = 0;
        } else {
            n11 = n(d11, e0Var.f17480b);
        }
        double d12 = lVar.f28491c;
        if (d12 == 0.0d) {
            n12 = 0;
        } else {
            n12 = n(d12, e0Var.f17481c);
        }
        double d13 = lVar.f28492d;
        if (d13 == 0.0d) {
            n13 = 0;
        } else {
            n13 = n(d13, e0Var.f17481c);
        }
        pi.o oVar = new pi.o(n10, n11, n12, n13, 0);
        this.f26372m.f20105d.a(5, null, new q(oVar, 1));
        return oVar;
    }

    public final pi.o m(pi.n nVar) {
        int n10;
        int n11;
        int n12;
        int n13;
        double d10 = nVar.f28502a;
        e0 e0Var = this.f;
        if (d10 == 0.0d) {
            n10 = 0;
        } else {
            n10 = n(d10, e0Var.f17480b);
        }
        double d11 = nVar.f28503b;
        if (d11 == 0.0d) {
            n11 = 0;
        } else {
            n11 = n(d11, e0Var.f17480b);
        }
        double d12 = nVar.f28504c;
        if (d12 == 0.0d) {
            n12 = 0;
        } else {
            n12 = n(d12, e0Var.f17481c);
        }
        double d13 = nVar.f28505d;
        if (d13 == 0.0d) {
            n13 = 0;
        } else {
            n13 = n(d13, e0Var.f17481c);
        }
        pi.o oVar = new pi.o(n10, n11, n12, n13, 0);
        this.f26372m.f20105d.a(5, null, new q(oVar, 0));
        return oVar;
    }
}
