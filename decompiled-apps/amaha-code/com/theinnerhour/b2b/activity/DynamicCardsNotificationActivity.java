package com.theinnerhour.b2b.activity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.c;
import androidx.cardview.widget.CardView;
import com.google.gson.reflect.TypeToken;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.DbDynamicCardsModel;
import com.theinnerhour.b2b.persistence.ApplicationPersistence;
import com.theinnerhour.b2b.utils.CourseUtilKt;
import com.theinnerhour.b2b.utils.LogHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import sf.i;
import w5.i0;
/* compiled from: DynamicCardsNotificationActivity.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/theinnerhour/b2b/activity/DynamicCardsNotificationActivity;", "Landroidx/appcompat/app/c;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class DynamicCardsNotificationActivity extends c {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f10396w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f10397v = new LinkedHashMap();

    public final View n0(int i6) {
        LinkedHashMap linkedHashMap = this.f10397v;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View findViewById = findViewById(i6);
            if (findViewById != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.p, androidx.activity.ComponentActivity, f0.k, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_dynamic_cards_notification);
        try {
            Object c10 = new i().c(ApplicationPersistence.getInstance().getStringValue("dynamic_cards_v2"), new TypeToken<ArrayList<DbDynamicCardsModel>>() { // from class: com.theinnerhour.b2b.activity.DynamicCardsNotificationActivity$onCreate$typeToken$1
            }.getType());
            kotlin.jvm.internal.i.f(c10, "Gson().fromJson(dcStr, typeToken)");
            ((ImageView) n0(R.id.header_arrow_back)).setOnClickListener(new i0(9, this));
            Iterator it = ((ArrayList) c10).iterator();
            while (it.hasNext()) {
                DbDynamicCardsModel dbDynamicCardsModel = (DbDynamicCardsModel) it.next();
                int card_status = dbDynamicCardsModel.getCard_status();
                boolean z10 = true;
                if (1 > card_status || card_status >= 3) {
                    z10 = false;
                }
                if (z10) {
                    View row = getLayoutInflater().inflate(R.layout.row_dashboard_dynamic_card, (ViewGroup) ((LinearLayout) n0(R.id.llDynamicCards)), false);
                    kotlin.jvm.internal.i.f(row, "row");
                    ((CardView) row.findViewById(R.id.dynamicCardContainer)).setOnClickListener(new a(CourseUtilKt.setDynamicCard(dbDynamicCardsModel, this, row), 4, this));
                    ((LinearLayout) n0(R.id.llDynamicCards)).addView(row);
                }
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(e10);
        }
    }
}
