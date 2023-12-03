package to;

import android.app.Dialog;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import androidx.appcompat.app.b;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.p;
import bm.h;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.model.AddFamilyMember;
import com.theinnerhour.b2b.model.Goal;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import dk.s;
import g0.a;
import gv.r;
import java.util.ArrayList;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.v;
import mq.k;
import tl.o;
/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b implements View.OnClickListener {

    /* renamed from: u  reason: collision with root package name */
    public final /* synthetic */ int f33384u;

    /* renamed from: v  reason: collision with root package name */
    public final /* synthetic */ int f33385v;

    /* renamed from: w  reason: collision with root package name */
    public final /* synthetic */ Object f33386w;

    /* renamed from: x  reason: collision with root package name */
    public final /* synthetic */ Object f33387x;

    public /* synthetic */ b(int i6, oq.d dVar, View view) {
        this.f33384u = 4;
        this.f33385v = i6;
        this.f33386w = dVar;
        this.f33387x = view;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i6 = this.f33385v;
        int i10 = this.f33384u;
        boolean z10 = true;
        String str = null;
        Object obj = this.f33387x;
        Object obj2 = this.f33386w;
        switch (i10) {
            case 0:
                AddFamilyMember addMember = (AddFamilyMember) obj2;
                c this$0 = (c) obj;
                i.g(addMember, "$addMember");
                i.g(this$0, "this$0");
                Bundle bundle = new Bundle();
                bundle.putString("variant", "new");
                bundle.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                String relation = addMember.getRelation();
                if (relation != null) {
                    str = relation;
                }
                bundle.putString(Constants.THOUGHTS_RELATIONSHIP, str);
                gk.a.b(bundle, "remove_family_cta_click");
                Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_remove_family_member, this$0.f33389y, R.style.Theme_Dialog);
                Window window = styledDialog.getWindow();
                i.d(window);
                window.getAttributes().windowAnimations = R.style.DialogGrowInAndShrinkOut;
                ((RobertoTextView) styledDialog.findViewById(R.id.tvFamilyRemoveNo)).setOnClickListener(new s(styledDialog, bundle));
                ((RobertoTextView) styledDialog.findViewById(R.id.tvFamilyRemoveYes)).setOnClickListener(new am.c(styledDialog, this$0, i6, bundle, 2));
                styledDialog.show();
                return;
            case 1:
                up.c this$02 = (up.c) obj2;
                Goal goal = (Goal) obj;
                i.g(this$02, "this$0");
                i.g(goal, "$goal");
                b.a aVar = new b.a(this$02.f34441x);
                aVar.setTitle("Are you sure you want to remove this goal?");
                aVar.b("Yes", new h(goal, this$02, i6, 3));
                aVar.a("Cancel", new yi.d(16));
                androidx.appcompat.app.b create = aVar.create();
                i.f(create, "builder.create()");
                create.show();
                Bundle bundle2 = new Bundle();
                bundle2.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                bundle2.putString("topicalCourse", goal.getSource());
                bundle2.putString(Constants.GOAL_ID, goal.getGoalId());
                bundle2.putString(Constants.GOAL_NAME, goal.getGoalName());
                bundle2.putString(Constants.GOAL_TYPE, goal.getType());
                bundle2.putString("screen", "topicalGoals");
                bundle2.putString("version", FirebasePersistence.getInstance().getUser().getVersion());
                gk.a.b(bundle2, "activity_remove_click");
                return;
            case 2:
                up.c this$03 = (up.c) obj2;
                v dailyGoalsChecked = (v) obj;
                i.g(this$03, "this$0");
                i.g(dailyGoalsChecked, "$dailyGoalsChecked");
                Goal goal2 = this$03.B.get(i6);
                i.f(goal2, "goalList[position]");
                this$03.C.t(goal2, i6);
                return;
            case 3:
                View view2 = (View) obj2;
                k this$04 = (k) obj;
                int i11 = k.A;
                i.g(this$04, "this$0");
                ((RadioButton) view2.findViewById(R.id.radioToggle)).setChecked(true);
                this$04.f25697x = ((RobertoTextView) view2.findViewById(R.id.rowText)).getText().toString();
                p activity = this$04.getActivity();
                i.d(activity);
                ((RadioButton) view2.findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(activity, R.color.sea)));
                int i12 = this$04.f25698y;
                if (i12 != -1 && i12 != i6) {
                    ((RadioButton) ((LinearLayout) this$04._$_findCachedViewById(R.id.rowItemContainer)).getChildAt(this$04.f25698y).findViewById(R.id.radioToggle)).setChecked(false);
                    p activity2 = this$04.getActivity();
                    i.d(activity2);
                    ((RadioButton) ((LinearLayout) this$04._$_findCachedViewById(R.id.rowItemContainer)).getChildAt(this$04.f25698y).findViewById(R.id.radioToggle)).setButtonTintList(ColorStateList.valueOf(g0.a.b(activity2, R.color.title_high_contrast)));
                }
                this$04.f25698y = i6;
                Context context = this$04.getContext();
                i.d(context);
                ((RobertoButton) this$04._$_findCachedViewById(R.id.continueCTA)).setBackground(a.c.b(context, R.drawable.button_dark_grey_fill));
                return;
            default:
                oq.d this$05 = (oq.d) obj2;
                View view3 = (View) obj;
                int i13 = oq.d.A;
                i.g(this$05, "this$0");
                ArrayList<String> arrayList = this$05.f27720u;
                if (arrayList != null) {
                    int size = arrayList.size() - 1;
                    ArrayList<String> arrayList2 = this$05.f27721v;
                    if (i6 != size) {
                        ArrayList<String> arrayList3 = this$05.f27720u;
                        if (arrayList3 != null) {
                            if (!arrayList2.contains(arrayList3.get(i6))) {
                                ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setImageResource(R.drawable.ic_right);
                                ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setColorFilter(Color.argb(255, 255, 255, 255));
                                ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.circle_blue);
                                ArrayList<String> arrayList4 = this$05.f27720u;
                                if (arrayList4 != null) {
                                    arrayList2.add(arrayList4.get(i6));
                                } else {
                                    i.q("options");
                                    throw null;
                                }
                            } else {
                                ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.ic_empty_circle_grey);
                                ArrayList<String> arrayList5 = this$05.f27720u;
                                if (arrayList5 != null) {
                                    arrayList2.remove(arrayList5.get(i6));
                                } else {
                                    i.q("options");
                                    throw null;
                                }
                            }
                        } else {
                            i.q("options");
                            throw null;
                        }
                    } else if (this$05.f27722w) {
                        this$05.f27722w = false;
                        ((RobertoEditText) this$05._$_findCachedViewById(R.id.otherEdit)).setVisibility(8);
                        ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.ic_empty_circle_grey);
                        Context context2 = this$05.getContext();
                        i.d(context2);
                        Object systemService = context2.getSystemService("input_method");
                        i.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        View view4 = this$05.getView();
                        i.d(view4);
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(view4.getWindowToken(), 0);
                    } else {
                        this$05.f27722w = true;
                        ((RobertoEditText) this$05._$_findCachedViewById(R.id.otherEdit)).setVisibility(0);
                        ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setImageResource(R.drawable.ic_right);
                        ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setColorFilter(Color.argb(255, 255, 255, 255));
                        ((AppCompatImageView) view3.findViewById(R.id.rowCheck)).setBackgroundResource(R.drawable.circle_blue);
                        new Handler().postDelayed(new o(22, this$05), 500L);
                    }
                    if (arrayList2.size() > 0 && !this$05.f27722w) {
                        ((RobertoButton) this$05._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                        return;
                    }
                    if (this$05.f27722w) {
                        if (r.i1(String.valueOf(((RobertoEditText) this$05._$_findCachedViewById(R.id.otherEdit)).getText())).toString().length() <= 0) {
                            z10 = false;
                        }
                        if (z10) {
                            ((RobertoButton) this$05._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_dark_grey_fill);
                            return;
                        }
                    }
                    ((RobertoButton) this$05._$_findCachedViewById(R.id.continueCTA)).setBackgroundResource(R.drawable.button_border_gray);
                    return;
                }
                i.q("options");
                throw null;
        }
    }

    public /* synthetic */ b(Object obj, Object obj2, int i6, int i10) {
        this.f33384u = i10;
        this.f33386w = obj;
        this.f33387x = obj2;
        this.f33385v = i6;
    }

    public /* synthetic */ b(up.c cVar, int i6, v vVar) {
        this.f33384u = 2;
        this.f33386w = cVar;
        this.f33385v = i6;
        this.f33387x = vVar;
    }
}
