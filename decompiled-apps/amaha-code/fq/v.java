package fq;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.T1Activity;
import com.theinnerhour.b2b.model.ScreenResult8Model;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: StaticResult8Fragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfq/v;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class v extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f15807w = 0;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f15809v = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f15808u = LogHelper.INSTANCE.makeLogTag(v.class);

    /* compiled from: StaticResult8Fragment.kt */
    /* loaded from: classes2.dex */
    public static final class a extends a5.f<Drawable> {
        public a() {
        }

        @Override // a5.h
        public final void f(Object obj) {
            ((ConstraintLayout) v.this._$_findCachedViewById(R.id.constraintLayout)).setBackground((Drawable) obj);
        }
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f15809v;
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
        return inflater.inflate(R.layout.fragment_static_result8, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f15809v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            androidx.fragment.app.p activity = getActivity();
            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.T1Activity");
            T1Activity t1Activity = (T1Activity) activity;
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Title)).setText("The 20 Minute Rule");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Heading)).setText("In a nutshell...");
            ((RobertoTextView) _$_findCachedViewById(R.id.tvR8Desc)).setText("Help your mind link your bed with sleeping! If you are unable to sleep for 20 minutes, get up and try these.");
            ((RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonOne)).setText("EDIT");
            ((RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonTwo)).setText("NEXT");
            ScreenResult8Model screenResult8Model = new ScreenResult8Model(Utils.INSTANCE.getTimeInSeconds());
            Glide.h(this).o(Integer.valueOf((int) R.drawable.template_background)).z(new a());
            ((RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonOne)).setOnClickListener(new j(t1Activity, 6));
            ((RobertoButton) _$_findCachedViewById(R.id.btnR8ButtonTwo)).setOnClickListener(new j(t1Activity, 7));
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new nn.v0(29, this));
            HashMap<String, Object> hashMap = t1Activity.B;
            Object obj = hashMap.get("list");
            kotlin.jvm.internal.i.e(obj, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
            screenResult8Model.setList((ArrayList) obj);
            if (hashMap.containsKey("userAdded")) {
                Object obj2 = hashMap.get("userAdded");
                kotlin.jvm.internal.i.e(obj2, "null cannot be cast to non-null type java.util.ArrayList<kotlin.String>{ kotlin.collections.TypeAliasesKt.ArrayList<kotlin.String> }");
                screenResult8Model.setUserAdded((ArrayList) obj2);
            }
            RobertoTextView robertoTextView = (RobertoTextView) _$_findCachedViewById(R.id.result1);
            String str2 = "";
            if (screenResult8Model.getList().size() <= 0) {
                str = "";
            } else {
                str = screenResult8Model.getList().get(0);
            }
            robertoTextView.setText(str);
            RobertoTextView robertoTextView2 = (RobertoTextView) _$_findCachedViewById(R.id.result2);
            if (screenResult8Model.getList().size() > 1) {
                str2 = screenResult8Model.getList().get(1);
            }
            robertoTextView2.setText(str2);
            if (screenResult8Model.getList().size() < 2) {
                ((ImageView) _$_findCachedViewById(R.id.imageView6)).setVisibility(8);
                _$_findCachedViewById(R.id.view3).setVisibility(8);
            }
            ((ImageView) _$_findCachedViewById(R.id.ivClose)).setOnClickListener(new j(t1Activity, 8));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f15808u, "Exception in on view created", e10);
        }
    }
}
