package oq;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionHopeActivity;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionHopeWaitScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Loq/u;", "Lrr/b;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class u extends rr.b {

    /* renamed from: x  reason: collision with root package name */
    public static final /* synthetic */ int f27774x = 0;

    /* renamed from: u  reason: collision with root package name */
    public int f27775u;

    /* renamed from: w  reason: collision with root package name */
    public final LinkedHashMap f27777w = new LinkedHashMap();

    /* renamed from: v  reason: collision with root package name */
    public final String f27776v = LogHelper.INSTANCE.makeLogTag(u.class);

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.f27777w;
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
        return inflater.inflate(R.layout.fragment_screen_a2, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f27777w.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            kotlin.jvm.internal.i.d(arguments);
            this.f27775u = arguments.getInt("Wait");
            ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setVisibility(0);
            ((ConstraintLayout) _$_findCachedViewById(R.id.a2parent)).setOnClickListener(new View.OnClickListener(this) { // from class: oq.t

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ u f27773v;

                {
                    this.f27773v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    u this$0 = this.f27773v;
                    switch (i6) {
                        case 0:
                            int i10 = u.f27774x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            androidx.fragment.app.p activity = this$0.getActivity();
                            kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                            ((DepressionHopeActivity) activity).t0();
                            return;
                        default:
                            int i11 = u.f27774x;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                            ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionHopePopupHead1));
                            ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionHopePopupBody1));
                            Window window = styledDialog.getWindow();
                            if (window != null) {
                                window.setLayout(-1, -1);
                            }
                            ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog, 2));
                            styledDialog.show();
                            return;
                    }
                }
            });
            switch (this.f27775u) {
                case 1:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionHopeWaitHead1));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 2:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionHopeWaitHead2));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 3:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionHopeWaitHead3));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(0);
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeTap));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setText(getString(R.string.depressionHopeWaitPromptText));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setOnClickListener(new View.OnClickListener(this) { // from class: oq.t

                        /* renamed from: v  reason: collision with root package name */
                        public final /* synthetic */ u f27773v;

                        {
                            this.f27773v = this;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            int i6 = r2;
                            u this$0 = this.f27773v;
                            switch (i6) {
                                case 0:
                                    int i10 = u.f27774x;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    androidx.fragment.app.p activity = this$0.getActivity();
                                    kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionHopeActivity");
                                    ((DepressionHopeActivity) activity).t0();
                                    return;
                                default:
                                    int i11 = u.f27774x;
                                    kotlin.jvm.internal.i.g(this$0, "this$0");
                                    Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.popup_screen_p1, this$0.getActivity(), R.style.Theme_Dialog_Fullscreen);
                                    ((RobertoTextView) styledDialog.findViewById(R.id.header)).setText(this$0.getString(R.string.depressionHopePopupHead1));
                                    ((RobertoTextView) styledDialog.findViewById(R.id.body)).setText(this$0.getString(R.string.depressionHopePopupBody1));
                                    Window window = styledDialog.getWindow();
                                    if (window != null) {
                                        window.setLayout(-1, -1);
                                    }
                                    ((AppCompatImageView) styledDialog.findViewById(R.id.btnBack)).setOnClickListener(new nq.n(styledDialog, 2));
                                    styledDialog.show();
                                    return;
                            }
                        }
                    });
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setPaintFlags(((RobertoTextView) _$_findCachedViewById(R.id.prompt)).getPaintFlags() | 8);
                    break;
                case 4:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionHopeWaitHeader4));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeWaitCTA4));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 5:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionHopeWaitHeader5));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeWaitCTA5));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
                case 6:
                    ((RobertoTextView) _$_findCachedViewById(R.id.a2header)).setText(getString(R.string.depressionHopeWaitHeader6));
                    ((RobertoTextView) _$_findCachedViewById(R.id.tapContinue)).setText(getString(R.string.depressionHopeWaitCTA6));
                    ((RobertoTextView) _$_findCachedViewById(R.id.prompt)).setVisibility(8);
                    break;
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f27776v, e10);
        }
    }
}
