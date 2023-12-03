package hr;

import android.app.Dialog;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSeekBar;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.TemplateActivity;
import com.theinnerhour.b2b.model.ProsAndConsModel;
import com.theinnerhour.b2b.model.ScreenResult14Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: ScreenS60Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lhr/j8;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class j8 extends rr.b {
    public static final /* synthetic */ int A = 0;

    /* renamed from: v  reason: collision with root package name */
    public ScreenResult14Model f18633v;

    /* renamed from: w  reason: collision with root package name */
    public ScreenResult14Model f18634w;

    /* renamed from: y  reason: collision with root package name */
    public View f18636y;

    /* renamed from: z  reason: collision with root package name */
    public final LinkedHashMap f18637z = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f18632u = LogHelper.INSTANCE.makeLogTag(j8.class);

    /* renamed from: x  reason: collision with root package name */
    public HashMap<String, Object> f18635x = new HashMap<>();

    /* compiled from: ScreenS60Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements SeekBar.OnSeekBarChangeListener {
        public a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onProgressChanged(SeekBar seekBar, int i6, boolean z10) {
            kotlin.jvm.internal.i.g(seekBar, "seekBar");
            seekBar.setThumb(j8.this.M(i6 + 1));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStartTrackingTouch(SeekBar seekBar) {
            kotlin.jvm.internal.i.g(seekBar, "seekBar");
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public final void onStopTrackingTouch(SeekBar seekBar) {
            kotlin.jvm.internal.i.g(seekBar, "seekBar");
        }
    }

    public final void J(boolean z10, ProsAndConsModel prosAndConsModel) {
        try {
            if (z10) {
                androidx.fragment.app.p activity = getActivity();
                kotlin.jvm.internal.i.d(activity);
                View inflate = activity.getLayoutInflater().inflate(R.layout.row_pros_and_cons, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llPros)), false);
                ((RobertoTextView) inflate.findViewById(R.id.textView1)).setText(String.valueOf(prosAndConsModel.getValue()));
                ((RobertoTextView) inflate.findViewById(R.id.textView2)).setText(prosAndConsModel.getText());
                ((LinearLayout) _$_findCachedViewById(R.id.llPros)).addView(inflate);
                K().getPros().add(prosAndConsModel);
                ((ScrollView) _$_findCachedViewById(R.id.scrollViewPros)).postDelayed(new Runnable(this) { // from class: hr.i8

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j8 f18590v;

                    {
                        this.f18590v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = r2;
                        j8 this$0 = this.f18590v;
                        switch (i6) {
                            case 0:
                                int i10 = j8.A;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int paddingBottom = ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getPaddingBottom() + ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getChildAt(((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getChildCount() - 1).getBottom();
                                int scrollY = ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getScrollY();
                                ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).smoothScrollBy(0, paddingBottom - (((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getHeight() + scrollY));
                                return;
                            default:
                                int i11 = j8.A;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int paddingBottom2 = ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getPaddingBottom() + ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getChildAt(((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getChildCount() - 1).getBottom();
                                int scrollY2 = ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getScrollY();
                                ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).smoothScrollBy(0, paddingBottom2 - (((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getHeight() + scrollY2));
                                return;
                        }
                    }
                }, 100L);
            } else {
                androidx.fragment.app.p activity2 = getActivity();
                kotlin.jvm.internal.i.d(activity2);
                View inflate2 = activity2.getLayoutInflater().inflate(R.layout.row_pros_and_cons, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.llCons)), false);
                ((RobertoTextView) inflate2.findViewById(R.id.textView1)).setText(String.valueOf(prosAndConsModel.getValue()));
                ((RobertoTextView) inflate2.findViewById(R.id.textView2)).setText(prosAndConsModel.getText());
                ((LinearLayout) _$_findCachedViewById(R.id.llCons)).addView(inflate2);
                K().getCons().add(prosAndConsModel);
                ((ScrollView) _$_findCachedViewById(R.id.scrollViewCons)).postDelayed(new Runnable(this) { // from class: hr.i8

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ j8 f18590v;

                    {
                        this.f18590v = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        int i6 = r2;
                        j8 this$0 = this.f18590v;
                        switch (i6) {
                            case 0:
                                int i10 = j8.A;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int paddingBottom = ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getPaddingBottom() + ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getChildAt(((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getChildCount() - 1).getBottom();
                                int scrollY = ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getScrollY();
                                ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).smoothScrollBy(0, paddingBottom - (((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewPros)).getHeight() + scrollY));
                                return;
                            default:
                                int i11 = j8.A;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                int paddingBottom2 = ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getPaddingBottom() + ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getChildAt(((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getChildCount() - 1).getBottom();
                                int scrollY2 = ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getScrollY();
                                ((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).smoothScrollBy(0, paddingBottom2 - (((ScrollView) this$0._$_findCachedViewById(R.id.scrollViewCons)).getHeight() + scrollY2));
                                return;
                        }
                    }
                }, 100L);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18632u, "Exception", e10);
        }
    }

    public final ScreenResult14Model K() {
        ScreenResult14Model screenResult14Model = this.f18633v;
        if (screenResult14Model != null) {
            return screenResult14Model;
        }
        kotlin.jvm.internal.i.q("model");
        throw null;
    }

    public final BitmapDrawable M(int i6) {
        View findViewById = O().findViewById(R.id.tvProgress);
        kotlin.jvm.internal.i.e(findViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) findViewById).setText(i6 + "");
        O().measure(0, 0);
        Bitmap createBitmap = Bitmap.createBitmap(O().getMeasuredWidth(), O().getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        O().layout(0, 0, O().getMeasuredWidth(), O().getMeasuredHeight());
        O().draw(canvas);
        return new BitmapDrawable(getResources(), createBitmap);
    }

    public final View O() {
        View view = this.f18636y;
        if (view != null) {
            return view;
        }
        kotlin.jvm.internal.i.q("thumbView");
        throw null;
    }

    public final void P(boolean z10) {
        UiUtils.Companion companion = UiUtils.Companion;
        androidx.fragment.app.p activity = getActivity();
        kotlin.jvm.internal.i.d(activity);
        Dialog fullScreenDialog = companion.getFullScreenDialog(R.layout.fragment_screen_s61, activity);
        if (z10) {
            if (this.f18635x.containsKey("s61_heading_pro")) {
                Object obj = this.f18635x.get("s61_heading_pro");
                kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvS61Header)).setText((String) obj);
            }
            if (this.f18635x.containsKey("s61_input_heading_pro")) {
                Object obj2 = this.f18635x.get("s61_input_heading_pro");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                ((TextView) fullScreenDialog.findViewById(R.id.tvS61InputHeading)).setText((String) obj2);
            }
            if (this.f18635x.containsKey("s61_input_placeholder_pro")) {
                Object obj3 = this.f18635x.get("s61_input_placeholder_pro");
                kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) fullScreenDialog.findViewById(R.id.etAddNew)).setHint((String) obj3);
            }
            if (this.f18635x.containsKey("s61_slider_heading_pro")) {
                Object obj4 = this.f18635x.get("s61_slider_heading_pro");
                kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                ((TextView) fullScreenDialog.findViewById(R.id.tvS61SeekbarTitle)).setText((String) obj4);
            }
            if (this.f18635x.containsKey("s61_btn_text_pro")) {
                Object obj5 = this.f18635x.get("s61_btn_text_pro");
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) fullScreenDialog.findViewById(R.id.btnS61Button)).setText((String) obj5);
            }
        } else {
            if (this.f18635x.containsKey("s61_heading_con")) {
                Object obj6 = this.f18635x.get("s61_heading_con");
                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type kotlin.String");
                ((RobertoTextView) fullScreenDialog.findViewById(R.id.tvS61Header)).setText((String) obj6);
            }
            if (this.f18635x.containsKey("s61_input_heading_con")) {
                Object obj7 = this.f18635x.get("s61_input_heading_con");
                kotlin.jvm.internal.i.e(obj7, "null cannot be cast to non-null type kotlin.String");
                ((TextView) fullScreenDialog.findViewById(R.id.tvS61InputHeading)).setText((String) obj7);
            }
            if (this.f18635x.containsKey("s61_input_placeholder_con")) {
                Object obj8 = this.f18635x.get("s61_input_placeholder_con");
                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type kotlin.String");
                ((RobertoEditText) fullScreenDialog.findViewById(R.id.etAddNew)).setHint((String) obj8);
            }
            if (this.f18635x.containsKey("s61_slider_heading_con")) {
                Object obj9 = this.f18635x.get("s61_slider_heading_con");
                kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type kotlin.String");
                ((TextView) fullScreenDialog.findViewById(R.id.tvS61SeekbarTitle)).setText((String) obj9);
            }
            if (this.f18635x.containsKey("s61_btn_text_con")) {
                Object obj10 = this.f18635x.get("s61_btn_text_con");
                kotlin.jvm.internal.i.e(obj10, "null cannot be cast to non-null type kotlin.String");
                ((RobertoButton) fullScreenDialog.findViewById(R.id.btnS61Button)).setText((String) obj10);
            }
        }
        ((ImageView) fullScreenDialog.findViewById(R.id.ivClose)).setOnClickListener(new nq.n(fullScreenDialog, 23));
        ((AppCompatSeekBar) fullScreenDialog.findViewById(R.id.S61Seekbar)).setThumb(M(3));
        ((AppCompatSeekBar) fullScreenDialog.findViewById(R.id.S61Seekbar)).setOnSeekBarChangeListener(new a());
        ((RobertoButton) fullScreenDialog.findViewById(R.id.btnS61Button)).setOnClickListener(new dl.l0(6, this, fullScreenDialog, z10));
        fullScreenDialog.show();
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f18637z;
        View view = (View) linkedHashMap.get(Integer.valueOf(i6));
        if (view == null) {
            View view2 = getView();
            if (view2 != null && (findViewById = view2.findViewById(i6)) != null) {
                linkedHashMap.put(Integer.valueOf(i6), findViewById);
                return findViewById;
            }
            return null;
        }
        return view;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_s60, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f18637z.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        boolean b10;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.seekbar_thumb, (ViewGroup) null, false);
            kotlin.jvm.internal.i.f(inflate, "from(activity).inflate(R…ekbar_thumb, null, false)");
            this.f18636y = inflate;
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.TemplateActivity");
            TemplateActivity templateActivity = (TemplateActivity) activity;
            this.f18635x = templateActivity.A0();
            String B0 = templateActivity.B0();
            if (kotlin.jvm.internal.i.b(B0, "s59-b")) {
                b10 = true;
            } else {
                b10 = kotlin.jvm.internal.i.b(B0, "s59b");
            }
            if (b10) {
                if (this.f18635x.containsKey("s60_heading")) {
                    Object obj = this.f18635x.get("s60_heading");
                    kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.tvS6061Header)).setText((String) obj);
                }
                if (this.f18635x.containsKey("s60_pros_heading")) {
                    Object obj2 = this.f18635x.get("s60_pros_heading");
                    kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.prosHeading)).setText((String) obj2);
                }
                if (this.f18635x.containsKey("s60_cons_heading")) {
                    Object obj3 = this.f18635x.get("s60_cons_heading");
                    kotlin.jvm.internal.i.e(obj3, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoTextView) _$_findCachedViewById(R.id.consHeading)).setText((String) obj3);
                }
                if (this.f18635x.containsKey("s60_btn_text")) {
                    Object obj4 = this.f18635x.get("s60_btn_text");
                    kotlin.jvm.internal.i.e(obj4, "null cannot be cast to non-null type kotlin.String");
                    ((RobertoButton) _$_findCachedViewById(R.id.btnR6061Button)).setText((String) obj4);
                }
            }
            HashMap<String, Object> hashMap = templateActivity.F;
            if (hashMap.containsKey("s60_user_list")) {
                Object obj5 = hashMap.get("s60_user_list");
                kotlin.jvm.internal.i.e(obj5, "null cannot be cast to non-null type com.theinnerhour.b2b.model.ScreenResult14Model");
                this.f18634w = (ScreenResult14Model) obj5;
                long timeInSeconds = Utils.INSTANCE.getTimeInSeconds();
                Object obj6 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj6, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                Object obj7 = ((ArrayList) obj6).get(0);
                kotlin.jvm.internal.i.f(obj7, "(act.tempData[\"list\"] as ArrayList<String>)[0]");
                this.f18633v = new ScreenResult14Model(timeInSeconds, (String) obj7);
                ScreenResult14Model screenResult14Model = this.f18634w;
                if (screenResult14Model != null) {
                    Iterator<ProsAndConsModel> it = screenResult14Model.getPros().iterator();
                    while (it.hasNext()) {
                        ProsAndConsModel tt2 = it.next();
                        kotlin.jvm.internal.i.f(tt2, "tt");
                        J(true, tt2);
                    }
                    ScreenResult14Model screenResult14Model2 = this.f18634w;
                    if (screenResult14Model2 != null) {
                        Iterator<ProsAndConsModel> it2 = screenResult14Model2.getCons().iterator();
                        while (it2.hasNext()) {
                            ProsAndConsModel tt3 = it2.next();
                            kotlin.jvm.internal.i.f(tt3, "tt");
                            J(false, tt3);
                        }
                    } else {
                        kotlin.jvm.internal.i.q("tempModel");
                        throw null;
                    }
                } else {
                    kotlin.jvm.internal.i.q("tempModel");
                    throw null;
                }
            } else {
                Object obj8 = hashMap.get("list");
                kotlin.jvm.internal.i.e(obj8, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                if (((ArrayList) obj8).size() > 0) {
                    long timeInSeconds2 = Utils.INSTANCE.getTimeInSeconds();
                    Object obj9 = hashMap.get("list");
                    kotlin.jvm.internal.i.e(obj9, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                    Object obj10 = ((ArrayList) obj9).get(0);
                    kotlin.jvm.internal.i.f(obj10, "(act.tempData[\"list\"] as ArrayList<String>)[0]");
                    this.f18633v = new ScreenResult14Model(timeInSeconds2, (String) obj10);
                }
            }
            ((RobertoButton) _$_findCachedViewById(R.id.btnR6061Button)).setOnClickListener(new g8(this, templateActivity));
            ((AppCompatImageView) _$_findCachedViewById(R.id.prosAddNew)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.h8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j8 f18548v;

                {
                    this.f18548v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    j8 this$0 = this.f18548v;
                    switch (i6) {
                        case 0:
                            int i10 = j8.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        default:
                            int i11 = j8.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(false);
                            return;
                    }
                }
            });
            ((AppCompatImageView) _$_findCachedViewById(R.id.consAddNew)).setOnClickListener(new View.OnClickListener(this) { // from class: hr.h8

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ j8 f18548v;

                {
                    this.f18548v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    j8 this$0 = this.f18548v;
                    switch (i6) {
                        case 0:
                            int i10 = j8.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(true);
                            return;
                        default:
                            int i11 = j8.A;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.P(false);
                            return;
                    }
                }
            });
            ((RobertoTextView) _$_findCachedViewById(R.id.textView13)).setText(K().getStatement());
            ((RobertoTextView) _$_findCachedViewById(R.id.textView13)).setMovementMethod(new ScrollingMovementMethod());
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivEllipses)).setOnClickListener(new g8(templateActivity, this, 1));
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setVisibility(0);
            ((ImageView) _$_findCachedViewById(R.id.ivHelp)).setOnClickListener(new g8(templateActivity, this, 2));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new b8(templateActivity, 1));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f18632u, "Exception in on view created ", e10);
        }
    }
}
