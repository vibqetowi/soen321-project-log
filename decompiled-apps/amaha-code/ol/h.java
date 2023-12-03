package ol;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import ik.l1;
import is.u;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import pl.o0;
import w5.i0;
/* compiled from: N3LogsAdapterBulletPointsUserEntered.kt */
/* loaded from: classes2.dex */
public final class h extends RecyclerView.e<a> {
    public final List<String> A;
    public final ZoneOffset B;
    public final ss.p<Integer, Long, hs.k> C;
    public final String D;
    public boolean E;

    /* renamed from: x  reason: collision with root package name */
    public final List<HashMap<String, Object>> f27628x;

    /* renamed from: y  reason: collision with root package name */
    public final String f27629y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27630z;

    /* compiled from: N3LogsAdapterBulletPointsUserEntered.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final MotionLayout f27631u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f27632v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f27633w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f27634x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f27635y;

        /* renamed from: z  reason: collision with root package name */
        public final View f27636z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.clRowN3ItemParentContainer);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.clRowN3ItemParentContainer)");
            this.f27631u = (MotionLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowN3ItemHeaderLeft);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvRowN3ItemHeaderLeft)");
            this.f27632v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowN3ItemHeaderRight);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.tvRowN3ItemHeaderRight)");
            this.f27633w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowN3ItemBody);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvRowN3ItemBody)");
            this.f27634x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvRowN3ItemCta);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.tvRowN3ItemCta)");
            this.f27635y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.clRowN3ItemDescriptionContainer);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.c…ItemDescriptionContainer)");
            this.f27636z = findViewById6;
        }
    }

    public h(List list, String str, String str2, ArrayList arrayList, ZoneOffset localZoneOffset, o0 o0Var) {
        kotlin.jvm.internal.i.g(localZoneOffset, "localZoneOffset");
        this.f27628x = list;
        this.f27629y = str;
        this.f27630z = str2;
        this.A = arrayList;
        this.B = localZoneOffset;
        this.C = o0Var;
        this.D = LogHelper.INSTANCE.makeLogTag("N3LogsAdapterBulletPointsUserEntered");
        this.E = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27628x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        Long l2;
        String str;
        List list;
        int b10;
        int b11;
        String str2;
        HashMap hashMap;
        a aVar2 = aVar;
        MotionLayout motionLayout = aVar2.f27631u;
        RobertoTextView robertoTextView = aVar2.f27632v;
        try {
            HashMap hashMap2 = (HashMap) u.j2(i6, this.f27628x);
            if (hashMap2 != null) {
                robertoTextView.setText(this.f27629y + ' ' + (i6 + 1));
                Object obj = hashMap2.get("date");
                if (obj instanceof Long) {
                    l2 = (Long) obj;
                } else {
                    l2 = null;
                }
                RobertoTextView robertoTextView2 = aVar2.f27633w;
                if (l2 != null) {
                    robertoTextView2.setText(LocalDateTime.ofEpochSecond(l2.longValue() / 1000, 0, this.B).format(DateTimeFormatter.ofPattern("dd MMMM, hh:mm a").withLocale(Locale.ENGLISH)));
                }
                String str3 = "";
                List<String> list2 = this.A;
                if (list2 != null) {
                    str = (String) u.j2(0, list2);
                } else {
                    str = null;
                }
                Object obj2 = hashMap2.get(str);
                if (obj2 instanceof List) {
                    list = (List) obj2;
                } else {
                    list = null;
                }
                View view = aVar2.f2751a;
                if (list != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (obj3 instanceof HashMap) {
                            hashMap = (HashMap) obj3;
                        } else {
                            hashMap = null;
                        }
                        if (hashMap != null) {
                            arrayList.add(hashMap);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Object obj4 = ((HashMap) it.next()).get("text");
                        if (obj4 instanceof String) {
                            str2 = (String) obj4;
                        } else {
                            str2 = null;
                        }
                        if (str2 != null) {
                            str3 = str3 + view.getContext().getString(R.string.bulletPointText, str2) + '\n';
                        }
                    }
                }
                aVar2.f27634x.setText(str3);
                aVar2.f27635y.setText(this.f27630z);
                view.setOnClickListener(new i0(27, aVar2));
                aVar2.f27636z.setOnClickListener(new l1(this, i6, hashMap2, 5));
                int i10 = i6 % 6;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    b10 = g0.a.b(view.getContext(), R.color.templateLightYellow);
                                } else {
                                    b10 = g0.a.b(view.getContext(), R.color.templateLightPurple);
                                }
                            } else {
                                b10 = g0.a.b(view.getContext(), R.color.templateLightPeach);
                            }
                        } else {
                            b10 = g0.a.b(view.getContext(), R.color.templateLightBlue);
                        }
                    } else {
                        b10 = g0.a.b(view.getContext(), R.color.templateLightRed);
                    }
                } else {
                    b10 = g0.a.b(view.getContext(), R.color.templateLightGreen);
                }
                motionLayout.setBackgroundColor(b10);
                int i11 = i6 % 6;
                if (i11 != 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 3) {
                                if (i11 != 4) {
                                    b11 = g0.a.b(view.getContext(), R.color.templateTextColorYellow);
                                } else {
                                    b11 = g0.a.b(view.getContext(), R.color.templateTextColorPurple);
                                }
                            } else {
                                b11 = g0.a.b(view.getContext(), R.color.templateTextColorPeach);
                            }
                        } else {
                            b11 = g0.a.b(view.getContext(), R.color.templateTextColorBlue);
                        }
                    } else {
                        b11 = g0.a.b(view.getContext(), R.color.templateTextColorRed);
                    }
                } else {
                    b11 = g0.a.b(view.getContext(), R.color.templateTextColorGreen);
                }
                robertoTextView.setTextColor(b11);
                robertoTextView2.setTextColor(b11);
                if (i6 == f() - 1 && this.E) {
                    this.E = false;
                    motionLayout.setProgress(1.0f);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.D, e10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_n3_logs_item, parent, false, "from(parent.context).inf…logs_item, parent, false)"));
    }
}
