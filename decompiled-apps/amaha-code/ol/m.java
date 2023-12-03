package ol;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.dynamicActivities.data.N12AItemListModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.u;
import j$.time.LocalDateTime;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import pl.p0;
/* compiled from: N3LogsAdapterNTS.kt */
/* loaded from: classes2.dex */
public final class m extends RecyclerView.e<a> {
    public final ZoneOffset A;
    public final ss.p<Integer, Long, hs.k> B;
    public boolean C;

    /* renamed from: x  reason: collision with root package name */
    public final List<hs.f<Long, List<N12AItemListModel>>> f27660x;

    /* renamed from: y  reason: collision with root package name */
    public final String f27661y;

    /* renamed from: z  reason: collision with root package name */
    public final String f27662z;

    /* compiled from: N3LogsAdapterNTS.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final MotionLayout f27663u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f27664v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f27665w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f27666x;

        /* renamed from: y  reason: collision with root package name */
        public final RobertoTextView f27667y;

        /* renamed from: z  reason: collision with root package name */
        public final View f27668z;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.clRowN3ItemParentContainer);
            kotlin.jvm.internal.i.f(findViewById, "view.findViewById(R.id.clRowN3ItemParentContainer)");
            this.f27663u = (MotionLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.tvRowN3ItemHeaderLeft);
            kotlin.jvm.internal.i.f(findViewById2, "view.findViewById(R.id.tvRowN3ItemHeaderLeft)");
            this.f27664v = (RobertoTextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.tvRowN3ItemHeaderRight);
            kotlin.jvm.internal.i.f(findViewById3, "view.findViewById(R.id.tvRowN3ItemHeaderRight)");
            this.f27665w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.tvRowN3ItemBody);
            kotlin.jvm.internal.i.f(findViewById4, "view.findViewById(R.id.tvRowN3ItemBody)");
            this.f27666x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.tvRowN3ItemCta);
            kotlin.jvm.internal.i.f(findViewById5, "view.findViewById(R.id.tvRowN3ItemCta)");
            this.f27667y = (RobertoTextView) findViewById5;
            View findViewById6 = view.findViewById(R.id.clRowN3ItemDescriptionContainer);
            kotlin.jvm.internal.i.f(findViewById6, "view.findViewById(R.id.c…ItemDescriptionContainer)");
            this.f27668z = findViewById6;
        }
    }

    public m(List list, String str, String str2, ZoneOffset localZoneOffset, p0 p0Var) {
        kotlin.jvm.internal.i.g(localZoneOffset, "localZoneOffset");
        this.f27660x = list;
        this.f27661y = str;
        this.f27662z = str2;
        this.A = localZoneOffset;
        this.B = p0Var;
        this.C = true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f27660x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, final int i6) {
        View view;
        int b10;
        int b11;
        a aVar2 = aVar;
        hs.f fVar = (hs.f) u.j2(i6, this.f27660x);
        if (fVar != null) {
            RobertoTextView robertoTextView = aVar2.f27664v;
            robertoTextView.setText(this.f27661y + ' ' + (i6 + 1));
            final long longValue = ((Number) fVar.f19464u).longValue();
            String format = LocalDateTime.ofEpochSecond(longValue / 1000, 0, this.A).format(DateTimeFormatter.ofPattern("dd MMMM, hh:mm a").withLocale(Locale.ENGLISH));
            RobertoTextView robertoTextView2 = aVar2.f27665w;
            robertoTextView2.setText(format);
            Iterator it = ((Iterable) fVar.f19465v).iterator();
            String str = "";
            while (true) {
                boolean hasNext = it.hasNext();
                view = aVar2.f2751a;
                if (!hasNext) {
                    break;
                }
                StringBuilder c10 = v.h.c(str);
                c10.append(view.getContext().getString(R.string.bulletPointText, ((N12AItemListModel) it.next()).getHeader()));
                c10.append('\n');
                str = c10.toString();
            }
            aVar2.f27666x.setText(str);
            aVar2.f27667y.setText(this.f27662z);
            view.setOnClickListener(new k(0, aVar2));
            aVar2.f27668z.setOnClickListener(new View.OnClickListener() { // from class: ol.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    m this$0 = m.this;
                    kotlin.jvm.internal.i.g(this$0, "this$0");
                    this$0.B.invoke(Integer.valueOf(i6), Long.valueOf(longValue));
                }
            });
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
            MotionLayout motionLayout = aVar2.f27663u;
            motionLayout.setBackgroundColor(b10);
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 != 4) {
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
            if (i6 == f() - 1 && this.C) {
                this.C = false;
                motionLayout.setProgress(1.0f);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        kotlin.jvm.internal.i.g(parent, "parent");
        return new a(defpackage.e.h(parent, R.layout.row_n3_logs_item, parent, false, "from(parent.context).inf…logs_item, parent, false)"));
    }
}
