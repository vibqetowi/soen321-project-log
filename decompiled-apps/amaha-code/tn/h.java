package tn;

import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import androidx.fragment.app.p;
import com.google.android.gms.internal.p000firebaseauthapi.qd;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFragmentListener;
import com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerListener;
import com.theinnerhour.b2b.persistence.FirebasePersistence;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.Utils;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: TrackerEmotionCloudFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Ltn/h;", "Lrr/b;", "Lcom/theinnerhour/b2b/components/multiTracker/model/MultiTrackerFragmentListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class h extends rr.b implements MultiTrackerFragmentListener {
    public static final /* synthetic */ int D = 0;
    public qd B;

    /* renamed from: x  reason: collision with root package name */
    public boolean f33356x;

    /* renamed from: y  reason: collision with root package name */
    public boolean f33357y;

    /* renamed from: z  reason: collision with root package name */
    public MultiTrackerListener f33358z;
    public final LinkedHashMap C = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f33353u = LogHelper.INSTANCE.makeLogTag("TrackerEmotionCloudFragment");

    /* renamed from: v  reason: collision with root package name */
    public final ArrayList<String> f33354v = new ArrayList<>();

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f33355w = new ArrayList<>();
    public int A = -1;

    public final Chip J(String str) {
        Chip chip = new Chip(getActivity(), null);
        try {
            chip.setLayoutParams(new ChipGroup.b());
            chip.setText(str);
            chip.setCheckable(true);
            chip.setChecked(false);
            chip.setGravity(17);
            chip.setTextColor(g0.a.b(requireContext(), R.color.title_high_contrast));
            chip.setCheckedIconVisible(false);
            chip.setChipIconVisible(false);
            chip.setCloseIconVisible(false);
            chip.setCloseIconTint(null);
            chip.setChipMinHeightResource(R.dimen._32sdp);
            chip.setChipBackgroundColorResource(R.color.login_grey_background);
            chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 8.0f, getResources().getDisplayMetrics())));
            chip.setChipStartPaddingResource(R.dimen.margin_16);
            chip.setChipEndPaddingResource(R.dimen.margin_16);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33353u, e10);
        }
        return chip;
    }

    public final Chip K() {
        Chip chip = new Chip(getActivity(), null);
        try {
            chip.setLayoutParams(new ChipGroup.b());
            chip.setText("");
            chip.setTextEndPadding(0.0f);
            chip.setTextStartPadding(0.0f);
            chip.setCheckable(false);
            chip.setChecked(false);
            chip.setGravity(17);
            chip.setChipIconVisible(true);
            Context requireContext = requireContext();
            Object obj = g0.a.f16164a;
            chip.setChipIcon(a.c.b(requireContext, R.drawable.ic_keyboard_arrow_down));
            chip.setCheckedIconVisible(false);
            chip.setCloseIconVisible(false);
            chip.setCloseIconTint(null);
            chip.setChipBackgroundColorResource(R.color.login_grey_background);
            chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 20.0f, getResources().getDisplayMetrics())));
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33353u, e10);
        }
        return chip;
    }

    public final void M(String str) {
        ChipGroup chipGroup;
        try {
            Chip J = J(str);
            if (this.f33355w.contains(str)) {
                J.setChipBackgroundColorResource(this.A);
                J.setTextColor(g0.a.b(requireContext(), R.color.white));
                J.setChecked(true);
            }
            J.setOnCheckedChangeListener(new g(this, J, 0));
            qd qdVar = this.B;
            if (qdVar != null && (chipGroup = (ChipGroup) qdVar.f8089w) != null) {
                chipGroup.addView(J);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33353u, e10);
        }
    }

    public final void O(String str) {
        ChipGroup chipGroup;
        try {
            Chip J = J(str);
            if (this.f33354v.contains(str)) {
                J.setChipBackgroundColorResource(this.A);
                J.setTextColor(g0.a.b(requireContext(), R.color.white));
                J.setChecked(true);
            }
            J.setOnCheckedChangeListener(new g(this, J, 1));
            qd qdVar = this.B;
            if (qdVar != null && (chipGroup = (ChipGroup) qdVar.f8090x) != null) {
                chipGroup.addView(J);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33353u, e10);
        }
    }

    public final void P() {
        MultiTrackerListener multiTrackerListener;
        ArrayList<String> arrayList = this.f33354v;
        try {
            boolean isEmpty = arrayList.isEmpty();
            ArrayList<String> arrayList2 = this.f33355w;
            if (isEmpty && arrayList2.isEmpty()) {
                MultiTrackerListener multiTrackerListener2 = this.f33358z;
                if (multiTrackerListener2 != null) {
                    multiTrackerListener2.setButtonEnabled(false);
                }
            } else if (arrayList.size() + arrayList2.size() <= 3 && (multiTrackerListener = this.f33358z) != null) {
                multiTrackerListener.setButtonEnabled(true);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33353u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        kotlin.jvm.internal.i.g(context, "context");
        super.onAttach(context);
        if (context instanceof MultiTrackerListener) {
            this.f33358z = (MultiTrackerListener) context;
        }
    }

    @Override // com.theinnerhour.b2b.components.multiTracker.model.MultiTrackerFragmentListener
    public final void onButtonClick() {
        ArrayList<String> arrayList = this.f33354v;
        try {
            boolean z10 = !arrayList.isEmpty();
            ArrayList<String> arrayList2 = this.f33355w;
            if ((z10 || (!arrayList2.isEmpty())) && arrayList.size() + arrayList2.size() <= 3) {
                MultiTrackerListener multiTrackerListener = this.f33358z;
                if (multiTrackerListener != null) {
                    multiTrackerListener.setPositiveEmotions(arrayList);
                    multiTrackerListener.setNegativeEmotions(arrayList2);
                    multiTrackerListener.goToNextScreen();
                }
                Bundle bundle = new Bundle();
                bundle.putStringArrayList("positiveEmotions", arrayList);
                bundle.putStringArrayList("negativeEmotions", arrayList2);
                bundle.putInt("mood", requireActivity().getIntent().getIntExtra("mood", 0));
                bundle.putString("course", FirebasePersistence.getInstance().getUser().getCurrentCourseName());
                MultiTrackerListener multiTrackerListener2 = this.f33358z;
                kotlin.jvm.internal.i.d(multiTrackerListener2);
                bundle.putBoolean("isOnboarding", multiTrackerListener2.getTutorialFlag());
                gk.a.b(bundle, "new_tracker_emotion_selection");
                return;
            }
            Utils utils = Utils.INSTANCE;
            p activity = getActivity();
            String string = getString(R.string.multiTrackerEmotionsErrorMsg1);
            kotlin.jvm.internal.i.f(string, "getString(R.string.multiTrackerEmotionsErrorMsg1)");
            utils.showCustomToast(activity, string);
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33353u, e10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        View inflate = getLayoutInflater().inflate(R.layout.fragment_tracker_emotion_cloud, (ViewGroup) null, false);
        int i6 = R.id.negativeEmotionChipGroup;
        ChipGroup chipGroup = (ChipGroup) hc.d.w(R.id.negativeEmotionChipGroup, inflate);
        if (chipGroup != null) {
            i6 = R.id.positiveEmotionChipGroup;
            ChipGroup chipGroup2 = (ChipGroup) hc.d.w(R.id.positiveEmotionChipGroup, inflate);
            if (chipGroup2 != null) {
                i6 = R.id.trackerEmotionCloudNegativeTitle;
                RobertoTextView robertoTextView = (RobertoTextView) hc.d.w(R.id.trackerEmotionCloudNegativeTitle, inflate);
                if (robertoTextView != null) {
                    i6 = R.id.trackerEmotionCloudPositiveTitle;
                    RobertoTextView robertoTextView2 = (RobertoTextView) hc.d.w(R.id.trackerEmotionCloudPositiveTitle, inflate);
                    if (robertoTextView2 != null) {
                        i6 = R.id.trackerEmotionCloudSubtitle;
                        RobertoTextView robertoTextView3 = (RobertoTextView) hc.d.w(R.id.trackerEmotionCloudSubtitle, inflate);
                        if (robertoTextView3 != null) {
                            i6 = R.id.trackerEmotionCloudTitle;
                            RobertoTextView robertoTextView4 = (RobertoTextView) hc.d.w(R.id.trackerEmotionCloudTitle, inflate);
                            if (robertoTextView4 != null) {
                                ScrollView scrollView = (ScrollView) inflate;
                                this.B = new qd(scrollView, chipGroup, chipGroup2, robertoTextView, robertoTextView2, robertoTextView3, robertoTextView4, 4);
                                return scrollView;
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i6)));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        this.B = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.C.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        int i6;
        ChipGroup chipGroup;
        ChipGroup chipGroup2;
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            Bundle arguments = getArguments();
            if (arguments != null) {
                i6 = arguments.getInt("color");
            } else {
                i6 = R.color.trackerGrey;
            }
            this.A = i6;
            String[] stringArray = getResources().getStringArray(R.array.TrackerPositiveEmotions);
            kotlin.jvm.internal.i.f(stringArray, "resources.getStringArray….TrackerPositiveEmotions)");
            final ArrayList k10 = ca.a.k(Arrays.copyOf(stringArray, stringArray.length));
            String[] stringArray2 = getResources().getStringArray(R.array.TrackerNegativeEmotions);
            kotlin.jvm.internal.i.f(stringArray2, "resources.getStringArray….TrackerNegativeEmotions)");
            final ArrayList k11 = ca.a.k(Arrays.copyOf(stringArray2, stringArray2.length));
            for (int i10 = 0; i10 < 10; i10++) {
                Object obj = k10.get(i10);
                kotlin.jvm.internal.i.f(obj, "positiveEmotionsList[i]");
                O((String) obj);
            }
            final Chip K = K();
            K.setOnClickListener(new View.OnClickListener(this) { // from class: tn.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ h f33347v;

                {
                    this.f33347v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChipGroup chipGroup3;
                    ChipGroup chipGroup4;
                    ChipGroup chipGroup5;
                    ChipGroup chipGroup6;
                    ChipGroup chipGroup7;
                    ChipGroup chipGroup8;
                    ChipGroup chipGroup9;
                    ChipGroup chipGroup10;
                    ChipGroup chipGroup11;
                    ChipGroup chipGroup12;
                    int i11 = r4;
                    int i12 = 0;
                    int i13 = 10;
                    ArrayList negativeEmotionsList = k10;
                    Chip negativeExpandableChip = K;
                    h this$0 = this.f33347v;
                    switch (i11) {
                        case 0:
                            int i14 = h.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(negativeExpandableChip, "$positiveExpandableChip");
                            kotlin.jvm.internal.i.g(negativeEmotionsList, "$positiveEmotionsList");
                            if (this$0.f33356x) {
                                Context requireContext = this$0.requireContext();
                                Object obj2 = g0.a.f16164a;
                                negativeExpandableChip.setChipIcon(a.c.b(requireContext, R.drawable.ic_keyboard_arrow_down));
                                qd qdVar = this$0.B;
                                if (qdVar != null && (chipGroup12 = (ChipGroup) qdVar.f8090x) != null) {
                                    chipGroup12.removeAllViews();
                                }
                                while (i12 < 10) {
                                    Object obj3 = negativeEmotionsList.get(i12);
                                    kotlin.jvm.internal.i.f(obj3, "positiveEmotionsList[i]");
                                    this$0.O((String) obj3);
                                    i12++;
                                }
                                qd qdVar2 = this$0.B;
                                if (qdVar2 != null && (chipGroup11 = (ChipGroup) qdVar2.f8090x) != null) {
                                    chipGroup11.addView(negativeExpandableChip);
                                }
                            } else {
                                qd qdVar3 = this$0.B;
                                if (qdVar3 != null && (chipGroup9 = (ChipGroup) qdVar3.f8090x) != null) {
                                    int childCount = chipGroup9.getChildCount() - 1;
                                    qd qdVar4 = this$0.B;
                                    if (qdVar4 != null && (chipGroup10 = (ChipGroup) qdVar4.f8090x) != null) {
                                        chipGroup10.removeViewAt(childCount);
                                    }
                                }
                                Context requireContext2 = this$0.requireContext();
                                Object obj4 = g0.a.f16164a;
                                negativeExpandableChip.setChipIcon(a.c.b(requireContext2, R.drawable.ic_keyboard_arrow_up));
                                int size = negativeEmotionsList.size();
                                while (i13 < size) {
                                    Object obj5 = negativeEmotionsList.get(i13);
                                    kotlin.jvm.internal.i.f(obj5, "positiveEmotionsList[i]");
                                    this$0.O((String) obj5);
                                    i13++;
                                }
                                qd qdVar5 = this$0.B;
                                if (qdVar5 != null && (chipGroup8 = (ChipGroup) qdVar5.f8090x) != null) {
                                    chipGroup8.addView(negativeExpandableChip);
                                }
                            }
                            this$0.f33356x = !this$0.f33356x;
                            return;
                        default:
                            int i15 = h.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(negativeExpandableChip, "$negativeExpandableChip");
                            kotlin.jvm.internal.i.g(negativeEmotionsList, "$negativeEmotionsList");
                            if (this$0.f33357y) {
                                Context requireContext3 = this$0.requireContext();
                                Object obj6 = g0.a.f16164a;
                                negativeExpandableChip.setChipIcon(a.c.b(requireContext3, R.drawable.ic_keyboard_arrow_down));
                                qd qdVar6 = this$0.B;
                                if (qdVar6 != null && (chipGroup7 = (ChipGroup) qdVar6.f8089w) != null) {
                                    chipGroup7.removeAllViews();
                                }
                                while (i12 < 10) {
                                    Object obj7 = negativeEmotionsList.get(i12);
                                    kotlin.jvm.internal.i.f(obj7, "negativeEmotionsList[i]");
                                    this$0.M((String) obj7);
                                    i12++;
                                }
                                qd qdVar7 = this$0.B;
                                if (qdVar7 != null && (chipGroup6 = (ChipGroup) qdVar7.f8089w) != null) {
                                    chipGroup6.addView(negativeExpandableChip);
                                }
                            } else {
                                qd qdVar8 = this$0.B;
                                if (qdVar8 != null && (chipGroup4 = (ChipGroup) qdVar8.f8089w) != null) {
                                    int childCount2 = chipGroup4.getChildCount() - 1;
                                    qd qdVar9 = this$0.B;
                                    if (qdVar9 != null && (chipGroup5 = (ChipGroup) qdVar9.f8089w) != null) {
                                        chipGroup5.removeViewAt(childCount2);
                                    }
                                }
                                Context requireContext4 = this$0.requireContext();
                                Object obj8 = g0.a.f16164a;
                                negativeExpandableChip.setChipIcon(a.c.b(requireContext4, R.drawable.ic_keyboard_arrow_up));
                                int size2 = negativeEmotionsList.size();
                                while (i13 < size2) {
                                    Object obj9 = negativeEmotionsList.get(i13);
                                    kotlin.jvm.internal.i.f(obj9, "negativeEmotionsList[i]");
                                    this$0.M((String) obj9);
                                    i13++;
                                }
                                qd qdVar10 = this$0.B;
                                if (qdVar10 != null && (chipGroup3 = (ChipGroup) qdVar10.f8089w) != null) {
                                    chipGroup3.addView(negativeExpandableChip);
                                }
                            }
                            this$0.f33357y = !this$0.f33357y;
                            return;
                    }
                }
            });
            qd qdVar = this.B;
            if (qdVar != null && (chipGroup2 = (ChipGroup) qdVar.f8090x) != null) {
                chipGroup2.addView(K);
            }
            for (int i11 = 0; i11 < 10; i11++) {
                Object obj2 = k11.get(i11);
                kotlin.jvm.internal.i.f(obj2, "negativeEmotionsList[i]");
                M((String) obj2);
            }
            final Chip K2 = K();
            K2.setOnClickListener(new View.OnClickListener(this) { // from class: tn.f

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ h f33347v;

                {
                    this.f33347v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    ChipGroup chipGroup3;
                    ChipGroup chipGroup4;
                    ChipGroup chipGroup5;
                    ChipGroup chipGroup6;
                    ChipGroup chipGroup7;
                    ChipGroup chipGroup8;
                    ChipGroup chipGroup9;
                    ChipGroup chipGroup10;
                    ChipGroup chipGroup11;
                    ChipGroup chipGroup12;
                    int i112 = r4;
                    int i12 = 0;
                    int i13 = 10;
                    ArrayList negativeEmotionsList = k11;
                    Chip negativeExpandableChip = K2;
                    h this$0 = this.f33347v;
                    switch (i112) {
                        case 0:
                            int i14 = h.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(negativeExpandableChip, "$positiveExpandableChip");
                            kotlin.jvm.internal.i.g(negativeEmotionsList, "$positiveEmotionsList");
                            if (this$0.f33356x) {
                                Context requireContext = this$0.requireContext();
                                Object obj22 = g0.a.f16164a;
                                negativeExpandableChip.setChipIcon(a.c.b(requireContext, R.drawable.ic_keyboard_arrow_down));
                                qd qdVar2 = this$0.B;
                                if (qdVar2 != null && (chipGroup12 = (ChipGroup) qdVar2.f8090x) != null) {
                                    chipGroup12.removeAllViews();
                                }
                                while (i12 < 10) {
                                    Object obj3 = negativeEmotionsList.get(i12);
                                    kotlin.jvm.internal.i.f(obj3, "positiveEmotionsList[i]");
                                    this$0.O((String) obj3);
                                    i12++;
                                }
                                qd qdVar22 = this$0.B;
                                if (qdVar22 != null && (chipGroup11 = (ChipGroup) qdVar22.f8090x) != null) {
                                    chipGroup11.addView(negativeExpandableChip);
                                }
                            } else {
                                qd qdVar3 = this$0.B;
                                if (qdVar3 != null && (chipGroup9 = (ChipGroup) qdVar3.f8090x) != null) {
                                    int childCount = chipGroup9.getChildCount() - 1;
                                    qd qdVar4 = this$0.B;
                                    if (qdVar4 != null && (chipGroup10 = (ChipGroup) qdVar4.f8090x) != null) {
                                        chipGroup10.removeViewAt(childCount);
                                    }
                                }
                                Context requireContext2 = this$0.requireContext();
                                Object obj4 = g0.a.f16164a;
                                negativeExpandableChip.setChipIcon(a.c.b(requireContext2, R.drawable.ic_keyboard_arrow_up));
                                int size = negativeEmotionsList.size();
                                while (i13 < size) {
                                    Object obj5 = negativeEmotionsList.get(i13);
                                    kotlin.jvm.internal.i.f(obj5, "positiveEmotionsList[i]");
                                    this$0.O((String) obj5);
                                    i13++;
                                }
                                qd qdVar5 = this$0.B;
                                if (qdVar5 != null && (chipGroup8 = (ChipGroup) qdVar5.f8090x) != null) {
                                    chipGroup8.addView(negativeExpandableChip);
                                }
                            }
                            this$0.f33356x = !this$0.f33356x;
                            return;
                        default:
                            int i15 = h.D;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            kotlin.jvm.internal.i.g(negativeExpandableChip, "$negativeExpandableChip");
                            kotlin.jvm.internal.i.g(negativeEmotionsList, "$negativeEmotionsList");
                            if (this$0.f33357y) {
                                Context requireContext3 = this$0.requireContext();
                                Object obj6 = g0.a.f16164a;
                                negativeExpandableChip.setChipIcon(a.c.b(requireContext3, R.drawable.ic_keyboard_arrow_down));
                                qd qdVar6 = this$0.B;
                                if (qdVar6 != null && (chipGroup7 = (ChipGroup) qdVar6.f8089w) != null) {
                                    chipGroup7.removeAllViews();
                                }
                                while (i12 < 10) {
                                    Object obj7 = negativeEmotionsList.get(i12);
                                    kotlin.jvm.internal.i.f(obj7, "negativeEmotionsList[i]");
                                    this$0.M((String) obj7);
                                    i12++;
                                }
                                qd qdVar7 = this$0.B;
                                if (qdVar7 != null && (chipGroup6 = (ChipGroup) qdVar7.f8089w) != null) {
                                    chipGroup6.addView(negativeExpandableChip);
                                }
                            } else {
                                qd qdVar8 = this$0.B;
                                if (qdVar8 != null && (chipGroup4 = (ChipGroup) qdVar8.f8089w) != null) {
                                    int childCount2 = chipGroup4.getChildCount() - 1;
                                    qd qdVar9 = this$0.B;
                                    if (qdVar9 != null && (chipGroup5 = (ChipGroup) qdVar9.f8089w) != null) {
                                        chipGroup5.removeViewAt(childCount2);
                                    }
                                }
                                Context requireContext4 = this$0.requireContext();
                                Object obj8 = g0.a.f16164a;
                                negativeExpandableChip.setChipIcon(a.c.b(requireContext4, R.drawable.ic_keyboard_arrow_up));
                                int size2 = negativeEmotionsList.size();
                                while (i13 < size2) {
                                    Object obj9 = negativeEmotionsList.get(i13);
                                    kotlin.jvm.internal.i.f(obj9, "negativeEmotionsList[i]");
                                    this$0.M((String) obj9);
                                    i13++;
                                }
                                qd qdVar10 = this$0.B;
                                if (qdVar10 != null && (chipGroup3 = (ChipGroup) qdVar10.f8089w) != null) {
                                    chipGroup3.addView(negativeExpandableChip);
                                }
                            }
                            this$0.f33357y = !this$0.f33357y;
                            return;
                    }
                }
            });
            qd qdVar2 = this.B;
            if (qdVar2 != null && (chipGroup = (ChipGroup) qdVar2.f8089w) != null) {
                chipGroup.addView(K2);
            }
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f33353u, e10);
        }
    }
}
