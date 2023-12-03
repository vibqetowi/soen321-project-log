package tn;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.l0;
import androidx.lifecycle.o0;
import androidx.lifecycle.w;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.charts.BarChart;
import com.google.firebase.auth.FirebaseAuth;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFirestoreStatsModel;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import is.e0;
import is.u;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import ta.v;
/* compiled from: TrackerInsightsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltn/j;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j extends rr.b {
    public static final /* synthetic */ int E = 0;
    public ArrayList<hs.f<String, Integer>> A;
    public wn.i B;
    public yp.j C;
    public final LinkedHashMap D = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f33361u = LogHelper.INSTANCE.makeLogTag("TrackerInsightsFragment");

    /* renamed from: v  reason: collision with root package name */
    public long f33362v = Calendar.getInstance().getTimeInMillis();

    /* renamed from: w  reason: collision with root package name */
    public final DateTimeFormatter f33363w = DateTimeFormatter.ofPattern("yyyyMMdd").withLocale(Locale.ENGLISH);

    /* renamed from: x  reason: collision with root package name */
    public final ZoneOffset f33364x;

    /* renamed from: y  reason: collision with root package name */
    public int f33365y;

    /* renamed from: z  reason: collision with root package name */
    public int f33366z;

    /* compiled from: TrackerInsightsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends kotlin.jvm.internal.k implements ss.l<MultiTrackerFirestoreStatsModel, hs.k> {
        public a() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel) {
            RobertoTextView robertoTextView;
            RobertoTextView robertoTextView2;
            RobertoTextView robertoTextView3;
            RobertoTextView robertoTextView4;
            RobertoTextView robertoTextView5;
            String string;
            String string2;
            String string3;
            String string4;
            String string5;
            ConstraintLayout constraintLayout;
            int i6;
            MultiTrackerFirestoreStatsModel multiTrackerFirestoreStatsModel2 = multiTrackerFirestoreStatsModel;
            if (multiTrackerFirestoreStatsModel2 != null) {
                int i10 = j.E;
                j jVar = j.this;
                jVar.getClass();
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(multiTrackerFirestoreStatsModel2.getEarliestTrackedDateInSeconds() * 1000);
                jVar.f33365y = Calendar.getInstance().get(3) - calendar.get(3);
                if (calendar.get(7) == 1) {
                    jVar.f33365y++;
                }
                if (Calendar.getInstance().get(7) == 1 && (i6 = jVar.f33365y) > 0) {
                    jVar.f33365y = i6 - 1;
                }
                RobertoTextView robertoTextView6 = null;
                ScrollView scrollView = null;
                if (multiTrackerFirestoreStatsModel2.getDayTrackedCount() == 0) {
                    yp.j jVar2 = jVar.C;
                    if (jVar2 != null) {
                        constraintLayout = jVar2.f38832l;
                    } else {
                        constraintLayout = null;
                    }
                    if (constraintLayout != null) {
                        constraintLayout.setVisibility(0);
                    }
                    yp.j jVar3 = jVar.C;
                    if (jVar3 != null) {
                        scrollView = jVar3.f38833m;
                    }
                    if (scrollView != null) {
                        scrollView.setVisibility(8);
                    }
                } else {
                    yp.j jVar4 = jVar.C;
                    if (jVar4 != null) {
                        robertoTextView = jVar4.f38838s;
                    } else {
                        robertoTextView = null;
                    }
                    if (robertoTextView != null) {
                        robertoTextView.setText(String.valueOf(multiTrackerFirestoreStatsModel2.getDayTrackedCount()));
                    }
                    yp.j jVar5 = jVar.C;
                    if (jVar5 != null) {
                        robertoTextView2 = jVar5.f38827g;
                    } else {
                        robertoTextView2 = null;
                    }
                    if (robertoTextView2 != null) {
                        if (multiTrackerFirestoreStatsModel2.getMood1TrackCount() == 1) {
                            string5 = jVar.getString(R.string.insightsTotalCountOneTime);
                        } else {
                            string5 = jVar.getString(R.string.insightsTotalCount, Integer.valueOf(multiTrackerFirestoreStatsModel2.getMood1TrackCount()));
                        }
                        robertoTextView2.setText(string5);
                    }
                    yp.j jVar6 = jVar.C;
                    if (jVar6 != null) {
                        robertoTextView3 = jVar6.f38828h;
                    } else {
                        robertoTextView3 = null;
                    }
                    if (robertoTextView3 != null) {
                        if (multiTrackerFirestoreStatsModel2.getMood2TrackCount() == 1) {
                            string4 = jVar.getString(R.string.insightsTotalCountOneTime);
                        } else {
                            string4 = jVar.getString(R.string.insightsTotalCount, Integer.valueOf(multiTrackerFirestoreStatsModel2.getMood2TrackCount()));
                        }
                        robertoTextView3.setText(string4);
                    }
                    yp.j jVar7 = jVar.C;
                    if (jVar7 != null) {
                        robertoTextView4 = jVar7.f38829i;
                    } else {
                        robertoTextView4 = null;
                    }
                    if (robertoTextView4 != null) {
                        if (multiTrackerFirestoreStatsModel2.getMood3TrackCount() == 1) {
                            string3 = jVar.getString(R.string.insightsTotalCountOneTime);
                        } else {
                            string3 = jVar.getString(R.string.insightsTotalCount, Integer.valueOf(multiTrackerFirestoreStatsModel2.getMood3TrackCount()));
                        }
                        robertoTextView4.setText(string3);
                    }
                    yp.j jVar8 = jVar.C;
                    if (jVar8 != null) {
                        robertoTextView5 = jVar8.f38830j;
                    } else {
                        robertoTextView5 = null;
                    }
                    if (robertoTextView5 != null) {
                        if (multiTrackerFirestoreStatsModel2.getMood4TrackCount() == 1) {
                            string2 = jVar.getString(R.string.insightsTotalCountOneTime);
                        } else {
                            string2 = jVar.getString(R.string.insightsTotalCount, Integer.valueOf(multiTrackerFirestoreStatsModel2.getMood4TrackCount()));
                        }
                        robertoTextView5.setText(string2);
                    }
                    yp.j jVar9 = jVar.C;
                    if (jVar9 != null) {
                        robertoTextView6 = jVar9.f38831k;
                    }
                    if (robertoTextView6 != null) {
                        if (multiTrackerFirestoreStatsModel2.getMood5TrackCount() == 1) {
                            string = jVar.getString(R.string.insightsTotalCountOneTime);
                        } else {
                            string = jVar.getString(R.string.insightsTotalCount, Integer.valueOf(multiTrackerFirestoreStatsModel2.getMood5TrackCount()));
                        }
                        robertoTextView6.setText(string);
                    }
                    jVar.O();
                }
            }
            return hs.k.f19476a;
        }
    }

    /* compiled from: TrackerInsightsFragment.kt */
    /* loaded from: classes2.dex */
    public static final class b extends kotlin.jvm.internal.k implements ss.l<List<? extends MultiTrackerModel>, hs.k> {
        public b() {
            super(1);
        }

        @Override // ss.l
        public final hs.k invoke(List<? extends MultiTrackerModel> list) {
            j jVar;
            ArrayList<hs.f<String, Integer>> arrayList;
            BarChart barChart;
            BarChart barChart2;
            BarChart barChart3;
            BarChart barChart4;
            BarChart barChart5;
            q6.h xAxis;
            BarChart barChart6;
            q6.i axisLeft;
            BarChart barChart7;
            q6.i axisRight;
            boolean z10;
            char c10;
            int i6;
            int i10;
            float mood;
            List<? extends MultiTrackerModel> list2 = list;
            if (list2 != null && (arrayList = (jVar = j.this).A) != null) {
                ArrayList arrayList2 = new ArrayList(is.i.H1(arrayList, 10));
                Iterator<hs.f<String, Integer>> it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(it.next().f19464u);
                }
                HashMap s02 = e0.s0(new hs.f(arrayList2.get(0), 0), new hs.f(arrayList2.get(1), 0), new hs.f(arrayList2.get(2), 0), new hs.f(arrayList2.get(3), 0), new hs.f(arrayList2.get(4), 0), new hs.f(arrayList2.get(5), 0), new hs.f(arrayList2.get(6), 0));
                HashMap s03 = e0.s0(new hs.f(arrayList2.get(0), Float.valueOf(0.0f)), new hs.f(arrayList2.get(1), Float.valueOf(0.0f)), new hs.f(arrayList2.get(2), Float.valueOf(0.0f)), new hs.f(arrayList2.get(3), Float.valueOf(0.0f)), new hs.f(arrayList2.get(4), Float.valueOf(0.0f)), new hs.f(arrayList2.get(5), Float.valueOf(0.0f)), new hs.f(arrayList2.get(6), Float.valueOf(0.0f)));
                for (MultiTrackerModel multiTrackerModel : list2) {
                    long time = multiTrackerModel.getDate().getTime();
                    ZoneOffset zoneOffset = jVar.f33364x;
                    LocalDateTime ofEpochSecond = LocalDateTime.ofEpochSecond(time, 0, zoneOffset);
                    DateTimeFormatter dateTimeFormatter = jVar.f33363w;
                    if (arrayList2.contains(ofEpochSecond.format(dateTimeFormatter))) {
                        String format = LocalDateTime.ofEpochSecond(multiTrackerModel.getDate().getTime(), 0, zoneOffset).format(dateTimeFormatter);
                        kotlin.jvm.internal.i.f(format, "ofEpochSecond(it.date.ti…Offset).format(formatter)");
                        Integer num = (Integer) s02.get(LocalDateTime.ofEpochSecond(multiTrackerModel.getDate().getTime(), 0, zoneOffset).format(dateTimeFormatter));
                        if (num != null) {
                            i10 = num.intValue() + 1;
                        } else {
                            i10 = 1;
                        }
                        s02.put(format, Integer.valueOf(i10));
                        String format2 = LocalDateTime.ofEpochSecond(multiTrackerModel.getDate().getTime(), 0, zoneOffset).format(dateTimeFormatter);
                        kotlin.jvm.internal.i.f(format2, "ofEpochSecond(it.date.ti…Offset).format(formatter)");
                        Float f = (Float) s03.get(LocalDateTime.ofEpochSecond(multiTrackerModel.getDate().getTime(), 0, zoneOffset).format(dateTimeFormatter));
                        if (f != null) {
                            mood = f.floatValue() + multiTrackerModel.getMood();
                        } else {
                            mood = multiTrackerModel.getMood();
                        }
                        s03.put(format2, Float.valueOf(mood));
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                int i11 = 0;
                while (true) {
                    float f2 = 1.0f;
                    if (i11 < 7) {
                        Object obj = s03.get(arrayList2.get(i11));
                        kotlin.jvm.internal.i.d(obj);
                        float floatValue = ((Number) obj).floatValue();
                        Object obj2 = s02.get(arrayList2.get(i11));
                        kotlin.jvm.internal.i.d(obj2);
                        if (((Number) obj2).intValue() != 0) {
                            Object obj3 = s02.get(arrayList2.get(i11));
                            kotlin.jvm.internal.i.d(obj3);
                            f2 = ((Number) obj3).intValue();
                        }
                        arrayList3.add(Float.valueOf(floatValue / f2));
                        i11++;
                    } else {
                        try {
                            break;
                        } catch (Exception e10) {
                            LogHelper.INSTANCE.e(jVar.f33361u, e10);
                        }
                    }
                }
                ArrayList arrayList4 = new ArrayList();
                ArrayList arrayList5 = new ArrayList();
                int size = arrayList3.size();
                for (int i12 = 0; i12 < size; i12++) {
                    arrayList4.add(new r6.c(i12, ((Number) arrayList3.get(i12)).floatValue()));
                    Context requireContext = jVar.requireContext();
                    Object obj4 = arrayList3.get(i12);
                    kotlin.jvm.internal.i.f(obj4, "dataList[i]");
                    float floatValue2 = ((Number) obj4).floatValue();
                    if (floatValue2 >= 1.0f && floatValue2 < 1.5f) {
                        c10 = 1;
                    } else if (floatValue2 >= 1.5f && floatValue2 < 2.5f) {
                        c10 = 2;
                    } else if (floatValue2 >= 2.5f && floatValue2 < 3.5f) {
                        c10 = 3;
                    } else if (floatValue2 >= 3.5f && floatValue2 < 4.5f) {
                        c10 = 4;
                    } else {
                        if (4.5f <= floatValue2 && floatValue2 <= 5.0f) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            c10 = 5;
                        } else {
                            c10 = 0;
                        }
                    }
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 == 5) {
                                        i6 = R.color.trackerYellow;
                                    }
                                } else {
                                    i6 = R.color.trackerBlue;
                                }
                            } else {
                                i6 = R.color.trackerPink;
                            }
                        } else {
                            i6 = R.color.trackerPurple;
                        }
                        arrayList5.add(Integer.valueOf(g0.a.b(requireContext, i6)));
                    }
                    i6 = R.color.trackerGrey;
                    arrayList5.add(Integer.valueOf(g0.a.b(requireContext, i6)));
                }
                r6.b bVar = new r6.b(arrayList4);
                bVar.f30498j = false;
                bVar.f30485v = g0.a.b(jVar.requireContext(), R.color.login_grey_background);
                bVar.f30490a = arrayList5;
                yp.j jVar2 = jVar.C;
                if (jVar2 != null && (barChart7 = jVar2.f) != null && (axisRight = barChart7.getAxisRight()) != null) {
                    axisRight.f29191t = false;
                    axisRight.r = false;
                    axisRight.f29190s = false;
                }
                yp.j jVar3 = jVar.C;
                if (jVar3 != null && (barChart6 = jVar3.f) != null && (axisLeft = barChart6.getAxisLeft()) != null) {
                    axisLeft.f29191t = false;
                    axisLeft.r = false;
                    axisLeft.f29190s = false;
                    axisLeft.f29186n = 5;
                    axisLeft.f29189q = false;
                    axisLeft.f29196y = true;
                    axisLeft.f29197z = 5.0f;
                    axisLeft.B = Math.abs(5.0f - axisLeft.A);
                    axisLeft.f29195x = true;
                    axisLeft.A = 0.0f;
                    axisLeft.B = Math.abs(axisLeft.f29197z - 0.0f);
                }
                s6.d dVar = new s6.d(ca.a.k("Mon", "Tue", "Wed", "Thurs", "Fri", "Sat", "Sun"));
                yp.j jVar4 = jVar.C;
                if (jVar4 != null && (barChart5 = jVar4.f) != null && (xAxis = barChart5.getXAxis()) != null) {
                    xAxis.f29202e = g0.a.b(jVar.requireContext(), R.color.title_high_contrast_54_opacity);
                    xAxis.r = false;
                    xAxis.f29190s = false;
                    xAxis.E = 1;
                    xAxis.f29187o = 1.0f;
                    xAxis.f29188p = true;
                    xAxis.f = dVar;
                }
                r6.a aVar = new r6.a(bVar);
                aVar.f30483j = 0.95f;
                yp.j jVar5 = jVar.C;
                if (jVar5 != null && (barChart4 = jVar5.f) != null) {
                    barChart4.setExtraLeftOffset(0.0f);
                    barChart4.setExtraTopOffset(20.0f);
                    barChart4.setExtraRightOffset(0.0f);
                    barChart4.setExtraBottomOffset(0.0f);
                    barChart4.setDrawGridBackground(false);
                    barChart4.setDrawBarShadow(true);
                    barChart4.setFitBars(false);
                    barChart4.setTouchEnabled(false);
                    barChart4.getDescription().f29198a = false;
                    barChart4.getLegend().f29198a = false;
                }
                yp.j jVar6 = jVar.C;
                if (jVar6 != null) {
                    barChart = jVar6.f;
                } else {
                    barChart = null;
                }
                if (barChart != null) {
                    barChart.setData(aVar);
                }
                yp.j jVar7 = jVar.C;
                if (jVar7 != null && (barChart3 = jVar7.f) != null) {
                    barChart3.invalidate();
                }
                yp.j jVar8 = jVar.C;
                if (jVar8 != null && (barChart2 = jVar8.f) != null) {
                    n6.a aVar2 = barChart2.M;
                    aVar2.getClass();
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar2, "phaseY", 0.0f, 1.0f);
                    ofFloat.setDuration(1000);
                    ofFloat.addUpdateListener(aVar2.f25891a);
                    ofFloat.start();
                }
                String substring = DateFormat.format("EEEE", jVar.f33362v).toString().substring(0, 3);
                kotlin.jvm.internal.i.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                jVar.J(substring);
            }
            return hs.k.f19476a;
        }
    }

    public j() {
        ZoneOffset offset = ZoneId.systemDefault().getRules().getOffset(Instant.now());
        kotlin.jvm.internal.i.f(offset, "systemDefault().rules.getOffset(Instant.now())");
        this.f33364x = offset;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [is.w] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.util.List, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.util.ArrayList] */
    public final void J(String str) {
        RobertoTextView robertoTextView;
        long timeInMillis;
        RobertoTextView robertoTextView2;
        RobertoTextView robertoTextView3;
        RobertoTextView robertoTextView4;
        RobertoTextView robertoTextView5;
        RobertoTextView robertoTextView6;
        RobertoTextView robertoTextView7;
        ?? r82;
        RobertoTextView robertoTextView8;
        String string;
        AppCompatImageView appCompatImageView;
        RecyclerView recyclerView;
        RecyclerView recyclerView2;
        AppCompatImageView appCompatImageView2;
        w<List<MultiTrackerModel>> wVar;
        List<MultiTrackerModel> d10;
        DateTimeFormatter dateTimeFormatter = this.f33363w;
        ZoneOffset zoneOffset = this.f33364x;
        try {
            int w10 = sp.b.w(this.f33362v);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f33362v);
            calendar.add(5, -w10);
            RecyclerView recyclerView3 = null;
            switch (str.hashCode()) {
                case 70909:
                    if (str.equals("Fri")) {
                        yp.j jVar = this.C;
                        if (jVar != null) {
                            robertoTextView = jVar.f38826e;
                        } else {
                            robertoTextView = null;
                        }
                        if (robertoTextView != null) {
                            robertoTextView.setText(getString(R.string.trackerFriday));
                        }
                        calendar.add(5, 5);
                        timeInMillis = calendar.getTimeInMillis();
                        break;
                    } else {
                        timeInMillis = 0;
                        break;
                    }
                case 77548:
                    if (str.equals("Mon")) {
                        yp.j jVar2 = this.C;
                        if (jVar2 != null) {
                            robertoTextView2 = jVar2.f38826e;
                        } else {
                            robertoTextView2 = null;
                        }
                        if (robertoTextView2 != null) {
                            robertoTextView2.setText(getString(R.string.trackerMonday));
                        }
                        calendar.add(5, 1);
                        timeInMillis = calendar.getTimeInMillis();
                        break;
                    } else {
                        timeInMillis = 0;
                        break;
                    }
                case 82886:
                    if (str.equals("Sat")) {
                        yp.j jVar3 = this.C;
                        if (jVar3 != null) {
                            robertoTextView3 = jVar3.f38826e;
                        } else {
                            robertoTextView3 = null;
                        }
                        if (robertoTextView3 != null) {
                            robertoTextView3.setText(getString(R.string.trackerSaturday));
                        }
                        calendar.add(5, 6);
                        timeInMillis = calendar.getTimeInMillis();
                        break;
                    } else {
                        timeInMillis = 0;
                        break;
                    }
                case 83500:
                    if (str.equals("Sun")) {
                        yp.j jVar4 = this.C;
                        if (jVar4 != null) {
                            robertoTextView4 = jVar4.f38826e;
                        } else {
                            robertoTextView4 = null;
                        }
                        if (robertoTextView4 != null) {
                            robertoTextView4.setText(getString(R.string.trackerSunday));
                        }
                        calendar.add(5, 7);
                        timeInMillis = calendar.getTimeInMillis();
                        break;
                    } else {
                        timeInMillis = 0;
                        break;
                    }
                case 84065:
                    if (str.equals("Thu")) {
                        yp.j jVar5 = this.C;
                        if (jVar5 != null) {
                            robertoTextView5 = jVar5.f38826e;
                        } else {
                            robertoTextView5 = null;
                        }
                        if (robertoTextView5 != null) {
                            robertoTextView5.setText(getString(R.string.trackerThursday));
                        }
                        calendar.add(5, 4);
                        timeInMillis = calendar.getTimeInMillis();
                        break;
                    } else {
                        timeInMillis = 0;
                        break;
                    }
                case 84452:
                    if (str.equals("Tue")) {
                        yp.j jVar6 = this.C;
                        if (jVar6 != null) {
                            robertoTextView6 = jVar6.f38826e;
                        } else {
                            robertoTextView6 = null;
                        }
                        if (robertoTextView6 != null) {
                            robertoTextView6.setText(getString(R.string.trackerTuesday));
                        }
                        calendar.add(5, 2);
                        timeInMillis = calendar.getTimeInMillis();
                        break;
                    } else {
                        timeInMillis = 0;
                        break;
                    }
                case 86838:
                    if (str.equals("Wed")) {
                        yp.j jVar7 = this.C;
                        if (jVar7 != null) {
                            robertoTextView7 = jVar7.f38826e;
                        } else {
                            robertoTextView7 = null;
                        }
                        if (robertoTextView7 != null) {
                            robertoTextView7.setText(getString(R.string.trackerWednesday));
                        }
                        calendar.add(5, 3);
                        timeInMillis = calendar.getTimeInMillis();
                        break;
                    } else {
                        timeInMillis = 0;
                        break;
                    }
                default:
                    timeInMillis = 0;
                    break;
            }
            wn.i iVar = this.B;
            if (iVar != null && (wVar = iVar.C) != null && (d10 = wVar.d()) != null) {
                r82 = new ArrayList();
                for (Object obj : d10) {
                    if (kotlin.jvm.internal.i.b(LocalDateTime.ofEpochSecond(((MultiTrackerModel) obj).getDate().getTime(), 0, zoneOffset).format(dateTimeFormatter), LocalDateTime.ofEpochSecond(timeInMillis / 1000, 0, zoneOffset).format(dateTimeFormatter))) {
                        r82.add(obj);
                    }
                }
            } else {
                r82 = is.w.f20676u;
            }
            yp.j jVar8 = this.C;
            if (jVar8 != null) {
                robertoTextView8 = jVar8.f38823b;
            } else {
                robertoTextView8 = null;
            }
            if (robertoTextView8 != null) {
                int size = r82.size();
                if (size != 0) {
                    if (size != 1) {
                        string = getString(R.string.insightsTrackedTimes, Integer.valueOf(r82.size()));
                    } else {
                        string = getString(R.string.insightsTrackedOnce);
                    }
                } else {
                    string = getString(R.string.insightsNoTrackingData);
                }
                robertoTextView8.setText(string);
            }
            if (r82.isEmpty()) {
                yp.j jVar9 = this.C;
                if (jVar9 != null) {
                    appCompatImageView2 = jVar9.f38824c;
                } else {
                    appCompatImageView2 = null;
                }
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setVisibility(0);
                }
                yp.j jVar10 = this.C;
                if (jVar10 != null) {
                    recyclerView3 = jVar10.f38825d;
                }
                if (recyclerView3 != null) {
                    recyclerView3.setVisibility(8);
                    return;
                }
                return;
            }
            yp.j jVar11 = this.C;
            if (jVar11 != null) {
                appCompatImageView = jVar11.f38824c;
            } else {
                appCompatImageView = null;
            }
            if (appCompatImageView != null) {
                appCompatImageView.setVisibility(8);
            }
            yp.j jVar12 = this.C;
            if (jVar12 != null) {
                recyclerView = jVar12.f38825d;
            } else {
                recyclerView = null;
            }
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            sn.b bVar = new sn.b(new ArrayList((Collection) r82));
            yp.j jVar13 = this.C;
            if (jVar13 != null) {
                recyclerView2 = jVar13.f38825d;
            } else {
                recyclerView2 = null;
            }
            if (recyclerView2 != null) {
                recyclerView2.setAdapter(bVar);
            }
            yp.j jVar14 = this.C;
            if (jVar14 != null) {
                recyclerView3 = jVar14.f38825d;
            }
            if (recyclerView3 != null) {
                recyclerView3.setLayoutManager(new GridLayoutManager(requireContext(), 6));
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33361u, e10);
        }
    }

    public final void K() {
        Integer num;
        Integer num2;
        hs.f fVar;
        hs.f fVar2;
        try {
            this.A = sp.b.v(this.f33362v);
            wn.i iVar = this.B;
            if (iVar != null) {
                String a10 = FirebaseAuth.getInstance().a();
                kotlin.jvm.internal.i.d(a10);
                ArrayList<hs.f<String, Integer>> arrayList = this.A;
                if (arrayList != null && (fVar2 = (hs.f) u.i2(arrayList)) != null) {
                    num = (Integer) fVar2.f19465v;
                } else {
                    num = null;
                }
                ArrayList<hs.f<String, Integer>> arrayList2 = this.A;
                if (arrayList2 != null && (fVar = (hs.f) u.p2(arrayList2)) != null) {
                    num2 = Integer.valueOf(((Number) fVar.f19465v).intValue() + 86399);
                } else {
                    num2 = null;
                }
                if (num != null && num2 != null) {
                    v.H(kc.f.H(iVar), null, 0, new wn.d(a10, num, num2, iVar, null), 3);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33361u, e10);
        }
    }

    public final void M() {
        DateTimeFormatter withLocale;
        long j10;
        RobertoTextView robertoTextView;
        try {
            int w10 = sp.b.w(this.f33362v);
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(this.f33362v);
            calendar.add(5, (-w10) + 1);
            String format = LocalDateTime.ofEpochSecond(calendar.getTimeInMillis() / 1000, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(calendar.getTimeInMillis()))).format(DateTimeFormatter.ofPattern("dd MMM").withLocale(Locale.ENGLISH));
            calendar.add(5, 6);
            String str = format + " - " + LocalDateTime.ofEpochSecond(calendar.getTimeInMillis() / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(calendar.getTimeInMillis()))).format(withLocale);
            yp.j jVar = this.C;
            if (jVar != null) {
                robertoTextView = jVar.f38839t;
            } else {
                robertoTextView = null;
            }
            if (robertoTextView != null) {
                robertoTextView.setText(str);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33361u, e10);
        }
    }

    public final void O() {
        boolean z10;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        AppCompatImageView appCompatImageView5;
        AppCompatImageView appCompatImageView6;
        AppCompatImageView appCompatImageView7;
        AppCompatImageView appCompatImageView8;
        AppCompatImageView appCompatImageView9;
        w<MultiTrackerFirestoreStatsModel> wVar;
        MultiTrackerFirestoreStatsModel d10;
        try {
            wn.i iVar = this.B;
            if (iVar != null && (wVar = iVar.B) != null && (d10 = wVar.d()) != null && d10.getDayTrackedCount() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            AppCompatImageView appCompatImageView10 = null;
            if (z10) {
                yp.j jVar = this.C;
                if (jVar != null) {
                    appCompatImageView7 = jVar.f38837q;
                } else {
                    appCompatImageView7 = null;
                }
                if (appCompatImageView7 != null) {
                    appCompatImageView7.setAlpha(0.3f);
                }
                yp.j jVar2 = this.C;
                if (jVar2 != null) {
                    appCompatImageView8 = jVar2.f38837q;
                } else {
                    appCompatImageView8 = null;
                }
                if (appCompatImageView8 != null) {
                    appCompatImageView8.setEnabled(false);
                }
                yp.j jVar3 = this.C;
                if (jVar3 != null) {
                    appCompatImageView9 = jVar3.f38836p;
                } else {
                    appCompatImageView9 = null;
                }
                if (appCompatImageView9 != null) {
                    appCompatImageView9.setAlpha(0.3f);
                }
                yp.j jVar4 = this.C;
                if (jVar4 != null) {
                    appCompatImageView10 = jVar4.f38836p;
                }
                if (appCompatImageView10 != null) {
                    appCompatImageView10.setEnabled(false);
                    return;
                }
                return;
            }
            if (this.f33366z == 0) {
                yp.j jVar5 = this.C;
                if (jVar5 != null) {
                    appCompatImageView5 = jVar5.f38837q;
                } else {
                    appCompatImageView5 = null;
                }
                if (appCompatImageView5 != null) {
                    appCompatImageView5.setAlpha(0.3f);
                }
                yp.j jVar6 = this.C;
                if (jVar6 != null) {
                    appCompatImageView6 = jVar6.f38837q;
                } else {
                    appCompatImageView6 = null;
                }
                if (appCompatImageView6 != null) {
                    appCompatImageView6.setEnabled(false);
                }
            } else {
                yp.j jVar7 = this.C;
                if (jVar7 != null) {
                    appCompatImageView = jVar7.f38837q;
                } else {
                    appCompatImageView = null;
                }
                if (appCompatImageView != null) {
                    appCompatImageView.setAlpha(1.0f);
                }
                yp.j jVar8 = this.C;
                if (jVar8 != null) {
                    appCompatImageView2 = jVar8.f38837q;
                } else {
                    appCompatImageView2 = null;
                }
                if (appCompatImageView2 != null) {
                    appCompatImageView2.setEnabled(true);
                }
            }
            if (this.f33365y == 0) {
                yp.j jVar9 = this.C;
                if (jVar9 != null) {
                    appCompatImageView4 = jVar9.f38836p;
                } else {
                    appCompatImageView4 = null;
                }
                if (appCompatImageView4 != null) {
                    appCompatImageView4.setAlpha(0.3f);
                }
                yp.j jVar10 = this.C;
                if (jVar10 != null) {
                    appCompatImageView10 = jVar10.f38836p;
                }
                if (appCompatImageView10 != null) {
                    appCompatImageView10.setEnabled(false);
                    return;
                }
                return;
            }
            yp.j jVar11 = this.C;
            if (jVar11 != null) {
                appCompatImageView3 = jVar11.f38836p;
            } else {
                appCompatImageView3 = null;
            }
            if (appCompatImageView3 != null) {
                appCompatImageView3.setAlpha(1.0f);
            }
            yp.j jVar12 = this.C;
            if (jVar12 != null) {
                appCompatImageView10 = jVar12.f38836p;
            }
            if (appCompatImageView10 != null) {
                appCompatImageView10.setEnabled(true);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33361u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_tracker_insights, (ViewGroup) null, false);
        int i6 = R.id.btnBackLog;
        AppCompatImageView appCompatImageView = (AppCompatImageView) hc.d.w(R.id.btnBackLog, inflate);
        if (appCompatImageView != null) {
            i6 = R.id.logListEmptyImg;
            if (((AppCompatImageView) hc.d.w(R.id.logListEmptyImg, inflate)) != null) {
                i6 = R.id.logListEmptyText;
                if (((RobertoTextView) hc.d.w(R.id.logListEmptyText, inflate)) != null) {
                    i6 = R.id.trackerDailyCountText;
                    RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.trackerDailyCountText, inflate);
                    if (robertoTextView != null) {
                        i6 = R.id.trackerDailyNullStateImg;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) hc.d.w(R.id.trackerDailyNullStateImg, inflate);
                        if (appCompatImageView2 != null) {
                            i6 = R.id.trackerDailyRv;
                            RecyclerView recyclerView = (RecyclerView) hc.d.w(R.id.trackerDailyRv, inflate);
                            if (recyclerView != null) {
                                i6 = R.id.trackerDaySelector;
                                RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.trackerDaySelector, inflate);
                                if (robertoTextView2 != null) {
                                    i6 = R.id.trackerInsightsBarChart;
                                    BarChart barChart = (BarChart) hc.d.w(R.id.trackerInsightsBarChart, inflate);
                                    if (barChart != null) {
                                        i6 = R.id.trackerInsightsGraphCard;
                                        if (((CardView) hc.d.w(R.id.trackerInsightsGraphCard, inflate)) != null) {
                                            i6 = R.id.trackerInsightsMood1Card;
                                            if (((CardView) hc.d.w(R.id.trackerInsightsMood1Card, inflate)) != null) {
                                                i6 = R.id.trackerInsightsMood1Img;
                                                if (((AppCompatImageView) hc.d.w(R.id.trackerInsightsMood1Img, inflate)) != null) {
                                                    i6 = R.id.trackerInsightsMood1Times;
                                                    RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.trackerInsightsMood1Times, inflate);
                                                    if (robertoTextView3 != null) {
                                                        i6 = R.id.trackerInsightsMood1Title;
                                                        if (((RobertoTextView) hc.d.w(R.id.trackerInsightsMood1Title, inflate)) != null) {
                                                            i6 = R.id.trackerInsightsMood2Card;
                                                            if (((CardView) hc.d.w(R.id.trackerInsightsMood2Card, inflate)) != null) {
                                                                i6 = R.id.trackerInsightsMood2Img;
                                                                if (((AppCompatImageView) hc.d.w(R.id.trackerInsightsMood2Img, inflate)) != null) {
                                                                    i6 = R.id.trackerInsightsMood2Times;
                                                                    RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.trackerInsightsMood2Times, inflate);
                                                                    if (robertoTextView4 != null) {
                                                                        i6 = R.id.trackerInsightsMood2Title;
                                                                        if (((RobertoTextView) hc.d.w(R.id.trackerInsightsMood2Title, inflate)) != null) {
                                                                            i6 = R.id.trackerInsightsMood3Card;
                                                                            if (((CardView) hc.d.w(R.id.trackerInsightsMood3Card, inflate)) != null) {
                                                                                i6 = R.id.trackerInsightsMood3Img;
                                                                                if (((AppCompatImageView) hc.d.w(R.id.trackerInsightsMood3Img, inflate)) != null) {
                                                                                    i6 = R.id.trackerInsightsMood3Times;
                                                                                    RobertoTextView robertoTextView5 = (RobertoTextView) hc.d.w(R.id.trackerInsightsMood3Times, inflate);
                                                                                    if (robertoTextView5 != null) {
                                                                                        i6 = R.id.trackerInsightsMood3Title;
                                                                                        if (((RobertoTextView) hc.d.w(R.id.trackerInsightsMood3Title, inflate)) != null) {
                                                                                            i6 = R.id.trackerInsightsMood4Card;
                                                                                            if (((CardView) hc.d.w(R.id.trackerInsightsMood4Card, inflate)) != null) {
                                                                                                i6 = R.id.trackerInsightsMood4Img;
                                                                                                if (((AppCompatImageView) hc.d.w(R.id.trackerInsightsMood4Img, inflate)) != null) {
                                                                                                    i6 = R.id.trackerInsightsMood4Times;
                                                                                                    RobertoTextView robertoTextView6 = (RobertoTextView) hc.d.w(R.id.trackerInsightsMood4Times, inflate);
                                                                                                    if (robertoTextView6 != null) {
                                                                                                        i6 = R.id.trackerInsightsMood4Title;
                                                                                                        if (((RobertoTextView) hc.d.w(R.id.trackerInsightsMood4Title, inflate)) != null) {
                                                                                                            i6 = R.id.trackerInsightsMood5Card;
                                                                                                            if (((CardView) hc.d.w(R.id.trackerInsightsMood5Card, inflate)) != null) {
                                                                                                                i6 = R.id.trackerInsightsMood5Img;
                                                                                                                if (((AppCompatImageView) hc.d.w(R.id.trackerInsightsMood5Img, inflate)) != null) {
                                                                                                                    i6 = R.id.trackerInsightsMood5Times;
                                                                                                                    RobertoTextView robertoTextView7 = (RobertoTextView) hc.d.w(R.id.trackerInsightsMood5Times, inflate);
                                                                                                                    if (robertoTextView7 != null) {
                                                                                                                        i6 = R.id.trackerInsightsMood5Title;
                                                                                                                        if (((RobertoTextView) hc.d.w(R.id.trackerInsightsMood5Title, inflate)) != null) {
                                                                                                                            i6 = R.id.trackerInsightsNullState;
                                                                                                                            ConstraintLayout constraintLayout = (ConstraintLayout) hc.d.w(R.id.trackerInsightsNullState, inflate);
                                                                                                                            if (constraintLayout != null) {
                                                                                                                                i6 = R.id.trackerInsightsScrollView;
                                                                                                                                ScrollView scrollView = (ScrollView) hc.d.w(R.id.trackerInsightsScrollView, inflate);
                                                                                                                                if (scrollView != null) {
                                                                                                                                    i6 = R.id.trackerInsightsSeparator;
                                                                                                                                    if (hc.d.w(R.id.trackerInsightsSeparator, inflate) != null) {
                                                                                                                                        i6 = R.id.trackerInsightsSeparator2;
                                                                                                                                        if (hc.d.w(R.id.trackerInsightsSeparator2, inflate) != null) {
                                                                                                                                            i6 = R.id.trackerInsightsTitle;
                                                                                                                                            if (((RobertoTextView) hc.d.w(R.id.trackerInsightsTitle, inflate)) != null) {
                                                                                                                                                i6 = R.id.trackerInsightsViewMore;
                                                                                                                                                RobertoTextView robertoTextView8 = (RobertoTextView) hc.d.w(R.id.trackerInsightsViewMore, inflate);
                                                                                                                                                if (robertoTextView8 != null) {
                                                                                                                                                    i6 = R.id.trackerInsightsViewMoreLayout;
                                                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) hc.d.w(R.id.trackerInsightsViewMoreLayout, inflate);
                                                                                                                                                    if (constraintLayout2 != null) {
                                                                                                                                                        i6 = R.id.trackerInsightsWeeklyLeft;
                                                                                                                                                        AppCompatImageView appCompatImageView3 = (AppCompatImageView) hc.d.w(R.id.trackerInsightsWeeklyLeft, inflate);
                                                                                                                                                        if (appCompatImageView3 != null) {
                                                                                                                                                            i6 = R.id.trackerInsightsWeeklyRight;
                                                                                                                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) hc.d.w(R.id.trackerInsightsWeeklyRight, inflate);
                                                                                                                                                            if (appCompatImageView4 != null) {
                                                                                                                                                                i6 = R.id.trackerLogs;
                                                                                                                                                                AppCompatImageView appCompatImageView5 = (AppCompatImageView) hc.d.w(R.id.trackerLogs, inflate);
                                                                                                                                                                if (appCompatImageView5 != null) {
                                                                                                                                                                    i6 = R.id.trackerNumDaysText;
                                                                                                                                                                    RobertoTextView robertoTextView9 = (RobertoTextView) hc.d.w(R.id.trackerNumDaysText, inflate);
                                                                                                                                                                    if (robertoTextView9 != null) {
                                                                                                                                                                        i6 = R.id.trackerNumDaysTitle;
                                                                                                                                                                        if (((RobertoTextView) hc.d.w(R.id.trackerNumDaysTitle, inflate)) != null) {
                                                                                                                                                                            i6 = R.id.trackerOverallTrackTitle;
                                                                                                                                                                            if (((RobertoTextView) hc.d.w(R.id.trackerOverallTrackTitle, inflate)) != null) {
                                                                                                                                                                                i6 = R.id.trackerViewMoreSeparator;
                                                                                                                                                                                if (hc.d.w(R.id.trackerViewMoreSeparator, inflate) != null) {
                                                                                                                                                                                    i6 = R.id.trackerWeekTitle;
                                                                                                                                                                                    RobertoTextView robertoTextView10 = (RobertoTextView) hc.d.w(R.id.trackerWeekTitle, inflate);
                                                                                                                                                                                    if (robertoTextView10 != null) {
                                                                                                                                                                                        i6 = R.id.trackerWeeklyAnalysisTitle;
                                                                                                                                                                                        if (((RobertoTextView) hc.d.w(R.id.trackerWeeklyAnalysisTitle, inflate)) != null) {
                                                                                                                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) inflate;
                                                                                                                                                                                            this.C = new yp.j(constraintLayout3, appCompatImageView, robertoTextView, appCompatImageView2, recyclerView, robertoTextView2, barChart, robertoTextView3, robertoTextView4, robertoTextView5, robertoTextView6, robertoTextView7, constraintLayout, scrollView, robertoTextView8, constraintLayout2, appCompatImageView3, appCompatImageView4, appCompatImageView5, robertoTextView9, robertoTextView10);
                                                                                                                                                                                            return constraintLayout3;
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.C = null;
        this.D.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        RobertoTextView robertoTextView;
        AppCompatImageView appCompatImageView;
        AppCompatImageView appCompatImageView2;
        AppCompatImageView appCompatImageView3;
        AppCompatImageView appCompatImageView4;
        String str2 = this.f33361u;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            l0 a10 = new o0(this).a(wn.i.class);
            wn.i iVar = (wn.i) a10;
            fd.f fVar = FirebaseAuth.getInstance().f;
            if (fVar != null) {
                str = fVar.j0();
            } else {
                str = null;
            }
            kotlin.jvm.internal.i.d(str);
            iVar.getClass();
            v.H(kc.f.H(iVar), kotlinx.coroutines.o0.f23642c, 0, new wn.f(iVar, str, null), 2);
            iVar.B.e(getViewLifecycleOwner(), new nn.k(11, new a()));
            iVar.C.e(getViewLifecycleOwner(), new nn.k(12, new b()));
            this.B = (wn.i) a10;
            K();
            M();
            try {
                yp.j jVar = this.C;
                if (jVar != null && (appCompatImageView4 = jVar.f38837q) != null) {
                    appCompatImageView4.setOnClickListener(new i(this, 4));
                }
                yp.j jVar2 = this.C;
                if (jVar2 != null && (appCompatImageView3 = jVar2.f38836p) != null) {
                    appCompatImageView3.setOnClickListener(new i(this, 5));
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(str2, e10);
            }
            yp.j jVar3 = this.C;
            if (jVar3 != null && (appCompatImageView2 = jVar3.r) != null) {
                appCompatImageView2.setOnClickListener(new i(this, 0));
            }
            yp.j jVar4 = this.C;
            if (jVar4 != null && (appCompatImageView = jVar4.f38822a) != null) {
                appCompatImageView.setOnClickListener(new i(this, 1));
            }
            yp.j jVar5 = this.C;
            if (jVar5 != null && (robertoTextView = jVar5.f38834n) != null) {
                robertoTextView.setOnClickListener(new i(this, 2));
            }
        } catch (Exception e11) {
            LogHelper.INSTANCE.e(str2, e11);
        }
    }
}
