package sn;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerModel;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;
import kotlin.jvm.internal.i;
/* compiled from: TrackerDailyMoodAdapter.kt */
/* loaded from: classes2.dex */
public final class b extends RecyclerView.e<a> {

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<MultiTrackerModel> f31775x;

    /* compiled from: TrackerDailyMoodAdapter.kt */
    /* loaded from: classes2.dex */
    public final class a extends RecyclerView.c0 {

        /* renamed from: u  reason: collision with root package name */
        public final AppCompatImageView f31776u;

        /* renamed from: v  reason: collision with root package name */
        public final RobertoTextView f31777v;

        public a(View view) {
            super(view);
            View findViewById = view.findViewById(R.id.dailyMoodImage);
            i.f(findViewById, "itemView.findViewById(R.id.dailyMoodImage)");
            this.f31776u = (AppCompatImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.dailyMoodTime);
            i.f(findViewById2, "itemView.findViewById(R.id.dailyMoodTime)");
            this.f31777v = (RobertoTextView) findViewById2;
        }
    }

    public b(ArrayList<MultiTrackerModel> arrayList) {
        this.f31775x = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final int f() {
        return this.f31775x.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final void n(a aVar, int i6) {
        int i10;
        a aVar2 = aVar;
        ArrayList<MultiTrackerModel> arrayList = this.f31775x;
        int mood = arrayList.get(i6).getMood();
        if (mood != 1) {
            if (mood != 2) {
                if (mood != 3) {
                    if (mood != 4) {
                        if (mood == 5) {
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
            aVar2.f31776u.setImageResource(i10);
            aVar2.f31777v.setText(LocalDateTime.ofEpochSecond(arrayList.get(i6).getDate().getTime(), 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(arrayList.get(i6).getDate().getTime() * 1000))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
        }
        i10 = R.drawable.ic_tracker_mood_1;
        aVar2.f31776u.setImageResource(i10);
        aVar2.f31777v.setText(LocalDateTime.ofEpochSecond(arrayList.get(i6).getDate().getTime(), 0, ZoneId.systemDefault().getRules().getOffset(Instant.ofEpochMilli(arrayList.get(i6).getDate().getTime() * 1000))).format(DateTimeFormatter.ofPattern("hh:mm a").withLocale(Locale.ENGLISH)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.e
    public final RecyclerView.c0 p(int i6, RecyclerView recyclerView) {
        View itemView = defpackage.b.e(recyclerView, "parent", R.layout.row_tracker_daily_mood, recyclerView, false);
        i.f(itemView, "itemView");
        return new a(itemView);
    }
}
