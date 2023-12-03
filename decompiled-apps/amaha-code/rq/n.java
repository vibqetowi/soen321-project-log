package rq;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionThoughtsActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionThoughtsSituationFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrq/n;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class n extends rr.b {

    /* renamed from: w  reason: collision with root package name */
    public static final /* synthetic */ int f30965w = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f30966u;

    /* renamed from: v  reason: collision with root package name */
    public final LinkedHashMap f30967v = new LinkedHashMap();

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f30967v;
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
        return inflater.inflate(R.layout.fragment_screen_a27, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f30967v.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        kotlin.jvm.internal.i.d(arguments);
        this.f30966u = arguments.getInt("Situation");
        InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
        RobertoTextView a27Title = (RobertoTextView) _$_findCachedViewById(R.id.a27Title);
        kotlin.jvm.internal.i.f(a27Title, "a27Title");
        insetsUtils.addStatusBarHeight(a27Title);
        ((AppCompatImageView) _$_findCachedViewById(R.id.a27FloatingButton)).setClickable(false);
        int i6 = this.f30966u;
        if (i6 != 1) {
            if (i6 == 2) {
                ((RobertoTextView) _$_findCachedViewById(R.id.a27Title)).setText(getString(R.string.depressionThoughtsHead));
                ((RobertoTextView) _$_findCachedViewById(R.id.a27Subtitle)).setText(getString(R.string.depressionThoughtsSubHead));
                ((RobertoTextView) _$_findCachedViewById(R.id.a27Example)).setText(getString(R.string.depressionThoughtsExample));
                ((RobertoTextView) _$_findCachedViewById(R.id.a27Title2)).setText(getString(R.string.depressionThoughtsExampleDescription));
                ((RobertoTextView) _$_findCachedViewById(R.id.a27Text1)).setText(getString(R.string.depressionThoughtsSubtext1));
                ((RobertoTextView) _$_findCachedViewById(R.id.a27Text2)).setText(getString(R.string.depressionThoughtsSubtext2));
                ((RobertoEditText) _$_findCachedViewById(R.id.a27EditText)).setHint(getString(R.string.depressionThoughtsFeelingsl));
                ((AppCompatImageView) _$_findCachedViewById(R.id.a27FloatingButton)).setOnClickListener(new View.OnClickListener(this) { // from class: rq.m

                    /* renamed from: v  reason: collision with root package name */
                    public final /* synthetic */ n f30964v;

                    {
                        this.f30964v = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        int i10 = r2;
                        n this$0 = this.f30964v;
                        switch (i10) {
                            case 0:
                                int i11 = n.f30965w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable text = ((RobertoEditText) this$0._$_findCachedViewById(R.id.a27EditText)).getText();
                                kotlin.jvm.internal.i.d(text);
                                if (!gv.n.B0(gv.r.i1(text).toString())) {
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                    Editable text2 = ((RobertoEditText) this$0._$_findCachedViewById(R.id.a27EditText)).getText();
                                    kotlin.jvm.internal.i.d(text2);
                                    String obj = gv.r.i1(text2).toString();
                                    kotlin.jvm.internal.i.g(obj, "<set-?>");
                                    ((DepressionThoughtsActivity) activity).B = obj;
                                    androidx.fragment.app.p activity2 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                    ((DepressionThoughtsActivity) activity2).t0();
                                    return;
                                }
                                Context context = this$0.getContext();
                                kotlin.jvm.internal.i.d(context);
                                Toast.makeText(context, this$0.getString(R.string.depressionThoughtsErrorMessage02), 1).show();
                                return;
                            default:
                                int i12 = n.f30965w;
                                kotlin.jvm.internal.i.g(this$0, "this$0");
                                Editable text3 = ((RobertoEditText) this$0._$_findCachedViewById(R.id.a27EditText)).getText();
                                kotlin.jvm.internal.i.d(text3);
                                if (!gv.n.B0(gv.r.i1(text3).toString())) {
                                    androidx.fragment.app.p activity3 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                    Editable text4 = ((RobertoEditText) this$0._$_findCachedViewById(R.id.a27EditText)).getText();
                                    kotlin.jvm.internal.i.d(text4);
                                    String obj2 = gv.r.i1(text4).toString();
                                    kotlin.jvm.internal.i.g(obj2, "<set-?>");
                                    ((DepressionThoughtsActivity) activity3).C = obj2;
                                    androidx.fragment.app.p activity4 = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                    ((DepressionThoughtsActivity) activity4).t0();
                                    return;
                                }
                                Context context2 = this$0.getContext();
                                kotlin.jvm.internal.i.d(context2);
                                Toast.makeText(context2, this$0.getString(R.string.depressionThoughtsErrorMessage02), 1).show();
                                return;
                        }
                    }
                });
            }
        } else {
            ((RobertoTextView) _$_findCachedViewById(R.id.a27Title)).setText(getString(R.string.depressionThoughtsSituationHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.a27Subtitle)).setText(getString(R.string.depressionThoughtsSituationSubHead));
            ((RobertoTextView) _$_findCachedViewById(R.id.a27Example)).setText(getString(R.string.depressionThoughtsSituationExample));
            ((RobertoTextView) _$_findCachedViewById(R.id.a27Title2)).setText(getString(R.string.depressionThoughtsSituationExampleDescription));
            ((RobertoTextView) _$_findCachedViewById(R.id.a27Text1)).setText(getString(R.string.depressionThoughtsSituationSubtext1));
            ((RobertoTextView) _$_findCachedViewById(R.id.a27Text2)).setText(getString(R.string.depressionThoughtsSituationSubtext2));
            ((RobertoEditText) _$_findCachedViewById(R.id.a27EditText)).setHint(getString(R.string.depressionThoughtsFeelingsl));
            ((AppCompatImageView) _$_findCachedViewById(R.id.a27FloatingButton)).setOnClickListener(new View.OnClickListener(this) { // from class: rq.m

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ n f30964v;

                {
                    this.f30964v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i10 = r2;
                    n this$0 = this.f30964v;
                    switch (i10) {
                        case 0:
                            int i11 = n.f30965w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text = ((RobertoEditText) this$0._$_findCachedViewById(R.id.a27EditText)).getText();
                            kotlin.jvm.internal.i.d(text);
                            if (!gv.n.B0(gv.r.i1(text).toString())) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                Editable text2 = ((RobertoEditText) this$0._$_findCachedViewById(R.id.a27EditText)).getText();
                                kotlin.jvm.internal.i.d(text2);
                                String obj = gv.r.i1(text2).toString();
                                kotlin.jvm.internal.i.g(obj, "<set-?>");
                                ((DepressionThoughtsActivity) activity).B = obj;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                ((DepressionThoughtsActivity) activity2).t0();
                                return;
                            }
                            Context context = this$0.getContext();
                            kotlin.jvm.internal.i.d(context);
                            Toast.makeText(context, this$0.getString(R.string.depressionThoughtsErrorMessage02), 1).show();
                            return;
                        default:
                            int i12 = n.f30965w;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Editable text3 = ((RobertoEditText) this$0._$_findCachedViewById(R.id.a27EditText)).getText();
                            kotlin.jvm.internal.i.d(text3);
                            if (!gv.n.B0(gv.r.i1(text3).toString())) {
                                androidx.fragment.app.p activity3 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity3, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                Editable text4 = ((RobertoEditText) this$0._$_findCachedViewById(R.id.a27EditText)).getText();
                                kotlin.jvm.internal.i.d(text4);
                                String obj2 = gv.r.i1(text4).toString();
                                kotlin.jvm.internal.i.g(obj2, "<set-?>");
                                ((DepressionThoughtsActivity) activity3).C = obj2;
                                androidx.fragment.app.p activity4 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity4, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionThoughtsActivity");
                                ((DepressionThoughtsActivity) activity4).t0();
                                return;
                            }
                            Context context2 = this$0.getContext();
                            kotlin.jvm.internal.i.d(context2);
                            Toast.makeText(context2, this$0.getString(R.string.depressionThoughtsErrorMessage02), 1).show();
                            return;
                    }
                }
            });
        }
        ((RobertoEditText) _$_findCachedViewById(R.id.a27EditText)).addTextChangedListener(new a());
    }

    /* compiled from: DepressionThoughtsSituationFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            boolean z10;
            AppCompatImageView appCompatImageView = (AppCompatImageView) n.this._$_findCachedViewById(R.id.a27FloatingButton);
            kotlin.jvm.internal.i.d(editable);
            if (gv.r.i1(editable).length() == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            appCompatImageView.setClickable(!z10);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
