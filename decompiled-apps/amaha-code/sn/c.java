package sn;

import android.content.Context;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import is.q;
import is.u;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.i;
/* compiled from: TrackerLogAdapter.kt */
/* loaded from: classes2.dex */
public final class c extends RecyclerView.e<RecyclerView.c0> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<Object> f31778x;

    /* renamed from: y  reason: collision with root package name */
    public final Context f31779y;

    /* renamed from: z  reason: collision with root package name */
    public final int f31780z = 1;
    public final int A = 2;

    /* compiled from: TrackerLogAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final RobertoTextView f31781u;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.trackerLogDate);
            i.f(findViewById, "itemView.findViewById(R.id.trackerLogDate)");
            this.f31781u = (RobertoTextView) findViewById;
        }
    }

    /* compiled from: TrackerLogAdapter.kt */
    /* loaded from: classes2.dex */
    public final class b extends RecyclerView.c0 {
        public final GridLayout A;
        public final RobertoTextView B;
        public final RobertoTextView C;
        public final View D;
        public final View E;
        public final View F;
        public final View G;
        public final View H;

        /* renamed from: u  reason: collision with root package name */
        public final ConstraintLayout f31782u;

        /* renamed from: v  reason: collision with root package name */
        public final AppCompatImageView f31783v;

        /* renamed from: w  reason: collision with root package name */
        public final RobertoTextView f31784w;

        /* renamed from: x  reason: collision with root package name */
        public final RobertoTextView f31785x;

        /* renamed from: y  reason: collision with root package name */
        public final ChipGroup f31786y;

        /* renamed from: z  reason: collision with root package name */
        public final RobertoTextView f31787z;

        public b(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.trackerLogParent);
            i.f(findViewById, "itemView.findViewById(R.id.trackerLogParent)");
            this.f31782u = (ConstraintLayout) findViewById;
            View findViewById2 = view.findViewById(R.id.trackerLogMoodImg);
            i.f(findViewById2, "itemView.findViewById(R.id.trackerLogMoodImg)");
            this.f31783v = (AppCompatImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.trackerLogMoodTitle);
            i.f(findViewById3, "itemView.findViewById(R.id.trackerLogMoodTitle)");
            this.f31784w = (RobertoTextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.trackerLogTime);
            i.f(findViewById4, "itemView.findViewById(R.id.trackerLogTime)");
            this.f31785x = (RobertoTextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.trackerLogChipGroup);
            i.f(findViewById5, "itemView.findViewById(R.id.trackerLogChipGroup)");
            this.f31786y = (ChipGroup) findViewById5;
            View findViewById6 = view.findViewById(R.id.trackerLogActivitiesTitle);
            i.f(findViewById6, "itemView.findViewById(R.…rackerLogActivitiesTitle)");
            this.f31787z = (RobertoTextView) findViewById6;
            View findViewById7 = view.findViewById(R.id.trackerLogActivitiesContainer);
            i.f(findViewById7, "itemView.findViewById(R.…erLogActivitiesContainer)");
            this.A = (GridLayout) findViewById7;
            View findViewById8 = view.findViewById(R.id.trackerLogLogsText);
            i.f(findViewById8, "itemView.findViewById(R.id.trackerLogLogsText)");
            this.B = (RobertoTextView) findViewById8;
            View findViewById9 = view.findViewById(R.id.trackerLogLogsTitle);
            i.f(findViewById9, "itemView.findViewById(R.id.trackerLogLogsTitle)");
            this.C = (RobertoTextView) findViewById9;
            View findViewById10 = view.findViewById(R.id.trackerLogSeparator);
            i.f(findViewById10, "itemView.findViewById(R.id.trackerLogSeparator)");
            this.D = findViewById10;
            View findViewById11 = view.findViewById(R.id.topLeftCorner);
            i.f(findViewById11, "itemView.findViewById(R.id.topLeftCorner)");
            this.E = findViewById11;
            View findViewById12 = view.findViewById(R.id.topRightCorner);
            i.f(findViewById12, "itemView.findViewById(R.id.topRightCorner)");
            this.F = findViewById12;
            View findViewById13 = view.findViewById(R.id.bottomLeftCorner);
            i.f(findViewById13, "itemView.findViewById(R.id.bottomLeftCorner)");
            this.G = findViewById13;
            View findViewById14 = view.findViewById(R.id.bottomRightCorner);
            i.f(findViewById14, "itemView.findViewById(R.id.bottomRightCorner)");
            this.H = findViewById14;
        }
    }

    public c(Context context, ArrayList arrayList) {
        this.f31778x = arrayList;
        this.f31779y = context;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f31778x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int h(int i6) {
        if (this.f31778x.get(i6) instanceof String) {
            return this.f31780z;
        }
        return this.A;
    }

    /* JADX WARN: Removed duplicated region for block: B:106:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e8 A[EDGE_INSN: B:109:0x01e8->B:62:0x01e8 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0209  */
    @Override // androidx.recyclerview.widget.RecyclerView.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void n(RecyclerView.c0 c0Var, int i6) {
        int i10;
        boolean z10;
        int mood;
        String str;
        ChipGroup chipGroup;
        Iterator it;
        boolean hasNext;
        Context context;
        ArrayList<String> activities;
        boolean z11;
        int i11;
        int i12;
        String log;
        boolean z12;
        int i13;
        int h10 = h(i6);
        int i14 = this.f31780z;
        ArrayList<Object> arrayList = this.f31778x;
        if (h10 == i14) {
            Object obj = arrayList.get(i6);
            i.e(obj, "null cannot be cast to non-null type kotlin.String");
            ((a) c0Var).f31781u.setText((String) obj);
            return;
        }
        boolean z13 = false;
        int i15 = 1;
        if (i6 >= 0 && i6 < arrayList.size() - 1) {
            b bVar = (b) c0Var;
            View view = bVar.H;
            view.setVisibility(8);
            View view2 = bVar.G;
            view2.setVisibility(8);
            View view3 = bVar.F;
            view3.setVisibility(8);
            View view4 = bVar.E;
            view4.setVisibility(8);
            if (arrayList.get(i6 - 1) instanceof String) {
                view4.setVisibility(0);
                view3.setVisibility(0);
            }
            if (arrayList.get(i6 + 1) instanceof String) {
                view2.setVisibility(0);
                view.setVisibility(0);
            }
        } else {
            b bVar2 = (b) c0Var;
            bVar2.H.setVisibility(0);
            bVar2.G.setVisibility(0);
        }
        Object obj2 = arrayList.get(i6);
        i.e(obj2, "null cannot be cast to non-null type com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel");
        MultiTrackerModel multiTrackerModel = (MultiTrackerModel) obj2;
        b bVar3 = (b) c0Var;
        int mood2 = multiTrackerModel.getMood();
        if (mood2 != 1) {
            if (mood2 != 2) {
                if (mood2 != 3) {
                    if (mood2 != 4) {
                        if (mood2 == 5) {
                            i10 = R.drawable.ic_tracker_mood_5;
                        }
                    } else {
                        i10 = R.drawable.ic_tracker_mood_4;
                    }
                } else {
                    i10 = R.drawable.ic_tracker_mood_3;
                }
            } else {
                i10 = R.drawable.ic_tracker_mood_2;
            }
            bVar3.f31783v.setImageResource(i10);
            z10 = arrayList.get(i6 - 1) instanceof String;
            View view5 = bVar3.D;
            if (!z10) {
                view5.setVisibility(8);
            } else {
                view5.setVisibility(0);
            }
            mood = multiTrackerModel.getMood();
            if (mood == 1) {
                if (mood != 2) {
                    if (mood != 3) {
                        if (mood != 4) {
                            if (mood != 5) {
                                str = "";
                            } else {
                                str = "Great";
                            }
                        } else {
                            str = "Good";
                        }
                    } else {
                        str = "Neutral";
                    }
                } else {
                    str = "Bad";
                }
            } else {
                str = "Terrible";
            }
            bVar3.f31784w.setText(str);
            long j10 = 1000;
            long time = multiTrackerModel.getDate().getTime() * j10;
            String format = LocalDateTime.ofEpochSecond(time / j10, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(time))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH));
            i.f(format, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
            bVar3.f31785x.setText(format);
            ArrayList<String> positiveEmotions = multiTrackerModel.getPositiveEmotions();
            ArrayList<String> other = multiTrackerModel.getNegativeEmotions();
            i.g(positiveEmotions, "<this>");
            i.g(other, "other");
            Set L2 = u.L2(positiveEmotions);
            q.R1(other, L2);
            chipGroup = bVar3.f31786y;
            chipGroup.removeAllViews();
            it = L2.iterator();
            while (true) {
                hasNext = it.hasNext();
                context = this.f31779y;
                if (hasNext) {
                    break;
                }
                String emotion = (String) it.next();
                int mood3 = multiTrackerModel.getMood();
                i.g(emotion, "emotion");
                i.g(context, "context");
                Chip chip = new Chip(context, null);
                chip.setLayoutParams(new ChipGroup.b());
                chip.setText(emotion);
                chip.setCheckable(false);
                chip.setChecked(true);
                chip.setGravity(17);
                chip.setTextColor(g0.a.b(context, R.color.white));
                chip.setCheckedIconVisible(false);
                chip.setChipIconVisible(false);
                chip.setCloseIconVisible(false);
                chip.setCloseIconTint(null);
                chip.setClickable(false);
                chip.setChipMinHeightResource(R.dimen._32sdp);
                if (mood3 != 1) {
                    if (mood3 != 2) {
                        if (mood3 != 3) {
                            if (mood3 != 4) {
                                if (mood3 == 5) {
                                    i13 = R.color.trackerYellow;
                                }
                            } else {
                                i13 = R.color.trackerBlue;
                            }
                        } else {
                            i13 = R.color.trackerPink;
                        }
                    } else {
                        i13 = R.color.trackerPurple;
                    }
                    chip.setChipBackgroundColorResource(i13);
                    chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics())));
                    chip.setChipStartPaddingResource(R.dimen.margin_16);
                    chip.setChipEndPaddingResource(R.dimen.margin_16);
                    chipGroup.addView(chip);
                }
                i13 = R.color.trackerGrey;
                chip.setChipBackgroundColorResource(i13);
                chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics())));
                chip.setChipStartPaddingResource(R.dimen.margin_16);
                chip.setChipEndPaddingResource(R.dimen.margin_16);
                chipGroup.addView(chip);
            }
            GridLayout gridLayout = bVar3.A;
            gridLayout.removeAllViews();
            activities = multiTrackerModel.getActivities();
            if (activities == null && !activities.isEmpty()) {
                z11 = false;
            } else {
                z11 = true;
            }
            RobertoTextView robertoTextView = bVar3.f31787z;
            if (!z11) {
                robertoTextView.setVisibility(8);
                gridLayout.setVisibility(8);
            } else {
                robertoTextView.setVisibility(0);
                gridLayout.setVisibility(0);
                Iterator<T> it2 = multiTrackerModel.getActivities().iterator();
                while (true) {
                    boolean hasNext2 = it2.hasNext();
                    i11 = R.id.activityCheck;
                    if (!hasNext2) {
                        break;
                    }
                    String str2 = (String) it2.next();
                    View inflate = LayoutInflater.from(context).inflate(R.layout.row_multi_tracker_activities_logs, gridLayout, z13);
                    AppCompatImageView appCompatImageView = (AppCompatImageView) inflate.findViewById(R.id.activityCheck);
                    int mood4 = multiTrackerModel.getMood();
                    if (mood4 != i15) {
                        if (mood4 != 2) {
                            if (mood4 != 3) {
                                if (mood4 != 4) {
                                    if (mood4 != 5) {
                                        i12 = R.drawable.ic_tracker_circle_empty;
                                    } else {
                                        i12 = R.drawable.ic_tracker_circle_yellow;
                                    }
                                } else {
                                    i12 = R.drawable.ic_tracker_circle_blue;
                                }
                            } else {
                                i12 = R.drawable.ic_tracker_circle_pink;
                            }
                        } else {
                            i12 = R.drawable.ic_tracker_circle_purple;
                        }
                    } else {
                        i12 = R.drawable.ic_tracker_circle_grey;
                    }
                    Object obj3 = g0.a.f16164a;
                    appCompatImageView.setBackground(a.c.b(context, i12));
                    if (sp.b.A(str2) != -1) {
                        ((AppCompatImageView) inflate.findViewById(R.id.activityCheck)).setImageResource(sp.b.A(str2));
                    }
                    ((RobertoTextView) inflate.findViewById(R.id.activityTitle)).setText(str2);
                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams(GridLayout.spec((int) LinearLayoutManager.INVALID_OFFSET, GridLayout.FILL, 1.0f), GridLayout.spec((int) LinearLayoutManager.INVALID_OFFSET, GridLayout.FILL, 1.0f));
                    layoutParams.height = -2;
                    layoutParams.width = 0;
                    inflate.setLayoutParams(layoutParams);
                    gridLayout.addView(inflate);
                    z13 = false;
                    i15 = 1;
                }
                int size = multiTrackerModel.getActivities().size();
                while (true) {
                    int i16 = size + 1;
                    if (size % 5 == 0) {
                        break;
                    }
                    View inflate2 = LayoutInflater.from(context).inflate(R.layout.row_multi_tracker_activities_logs, (ViewGroup) gridLayout, false);
                    ((AppCompatImageView) inflate2.findViewById(i11)).setVisibility(4);
                    ((RobertoTextView) inflate2.findViewById(R.id.activityTitle)).setVisibility(4);
                    GridLayout.LayoutParams layoutParams2 = new GridLayout.LayoutParams(GridLayout.spec((int) LinearLayoutManager.INVALID_OFFSET, GridLayout.FILL, 1.0f), GridLayout.spec((int) LinearLayoutManager.INVALID_OFFSET, GridLayout.FILL, 1.0f));
                    layoutParams2.height = -2;
                    layoutParams2.width = 0;
                    inflate2.setLayoutParams(layoutParams2);
                    gridLayout.addView(inflate2);
                    size = i16;
                    i11 = R.id.activityCheck;
                }
            }
            log = multiTrackerModel.getLog();
            if (log == null && log.length() != 0) {
                z12 = false;
            } else {
                z12 = true;
            }
            RobertoTextView robertoTextView2 = bVar3.C;
            RobertoTextView robertoTextView3 = bVar3.B;
            ConstraintLayout constraintLayout = bVar3.f31782u;
            if (!z12) {
                robertoTextView3.setVisibility(8);
                robertoTextView2.setVisibility(8);
                androidx.constraintlayout.widget.b bVar4 = new androidx.constraintlayout.widget.b();
                bVar4.f(constraintLayout);
                bVar4.g(R.id.trackerLogParent, 4);
                bVar4.b(constraintLayout);
                return;
            }
            androidx.constraintlayout.widget.b bVar5 = new androidx.constraintlayout.widget.b();
            bVar5.f(constraintLayout);
            bVar5.g(R.id.trackerLogLogsTitle, 3);
            bVar5.b(constraintLayout);
            robertoTextView3.setVisibility(0);
            robertoTextView2.setVisibility(0);
            robertoTextView3.setText(multiTrackerModel.getLog());
            return;
        }
        i10 = R.drawable.ic_tracker_mood_1;
        bVar3.f31783v.setImageResource(i10);
        z10 = arrayList.get(i6 - 1) instanceof String;
        View view52 = bVar3.D;
        if (!z10) {
        }
        mood = multiTrackerModel.getMood();
        if (mood == 1) {
        }
        bVar3.f31784w.setText(str);
        long j102 = 1000;
        long time2 = multiTrackerModel.getDate().getTime() * j102;
        String format2 = LocalDateTime.ofEpochSecond(time2 / j102, 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(time2))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH));
        i.f(format2, "ofEpochSecond(timeInMill…thLocale(Locale.ENGLISH))");
        bVar3.f31785x.setText(format2);
        ArrayList<String> positiveEmotions2 = multiTrackerModel.getPositiveEmotions();
        ArrayList<String> other2 = multiTrackerModel.getNegativeEmotions();
        i.g(positiveEmotions2, "<this>");
        i.g(other2, "other");
        Set L22 = u.L2(positiveEmotions2);
        q.R1(other2, L22);
        chipGroup = bVar3.f31786y;
        chipGroup.removeAllViews();
        it = L22.iterator();
        while (true) {
            hasNext = it.hasNext();
            context = this.f31779y;
            if (hasNext) {
            }
            chip.setChipBackgroundColorResource(i13);
            chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics())));
            chip.setChipStartPaddingResource(R.dimen.margin_16);
            chip.setChipEndPaddingResource(R.dimen.margin_16);
            chipGroup.addView(chip);
        }
        GridLayout gridLayout2 = bVar3.A;
        gridLayout2.removeAllViews();
        activities = multiTrackerModel.getActivities();
        if (activities == null) {
        }
        z11 = true;
        RobertoTextView robertoTextView4 = bVar3.f31787z;
        if (!z11) {
        }
        log = multiTrackerModel.getLog();
        if (log == null) {
        }
        z12 = true;
        RobertoTextView robertoTextView22 = bVar3.C;
        RobertoTextView robertoTextView32 = bVar3.B;
        ConstraintLayout constraintLayout2 = bVar3.f31782u;
        if (!z12) {
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView parent) {
        i.g(parent, "parent");
        if (i6 == this.f31780z) {
            return new a(e.h(parent, R.layout.row_tracker_log_date, parent, false, "from(parent.context)\n   …_log_date, parent, false)"));
        }
        return new b(e.h(parent, R.layout.row_tracker_log_item, parent, false, "from(parent.context)\n   …_log_item, parent, false)"));
    }
}
