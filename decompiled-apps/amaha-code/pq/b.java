package pq;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.CompoundButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.activity.DepressionMasteryActivity;
import com.theinnerhour.b2b.utils.InsetsUtils;
import com.theinnerhour.b2b.utils.LogHelper;
import com.theinnerhour.b2b.utils.UiUtils;
import com.theinnerhour.b2b.widgets.RobertoButton;
import com.theinnerhour.b2b.widgets.RobertoEditText;
import com.theinnerhour.b2b.widgets.RobertoTextView;
import g0.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
/* compiled from: DepressionMasteryChipFragment.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lpq/b;", "Lrr/b;", "Landroid/widget/CompoundButton$OnCheckedChangeListener;", "<init>", "()V", "app_productionRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes2.dex */
public final class b extends rr.b implements CompoundButton.OnCheckedChangeListener {
    public static final /* synthetic */ int C = 0;

    /* renamed from: y  reason: collision with root package name */
    public Chip f28767y;

    /* renamed from: z  reason: collision with root package name */
    public boolean f28768z;
    public final LinkedHashMap B = new LinkedHashMap();

    /* renamed from: u  reason: collision with root package name */
    public final String f28763u = LogHelper.INSTANCE.makeLogTag(b.class);

    /* renamed from: v  reason: collision with root package name */
    public String f28764v = "";

    /* renamed from: w  reason: collision with root package name */
    public final ArrayList<String> f28765w = new ArrayList<>();

    /* renamed from: x  reason: collision with root package name */
    public final ArrayList<String> f28766x = new ArrayList<>();
    public final HashMap<String, Boolean> A = new HashMap<>();

    public final void J(boolean z10) {
        int i6;
        this.f28768z = z10;
        RobertoButton robertoButton = (RobertoButton) _$_findCachedViewById(R.id.btnContinue);
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        if (z10) {
            i6 = R.drawable.button_dark_grey_fill;
        } else {
            i6 = R.drawable.button_border_gray;
        }
        Object obj = g0.a.f16164a;
        robertoButton.setBackground(a.c.b(context, i6));
    }

    public final void K(String str, boolean z10) {
        View childAt = ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).getChildAt(((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).getChildCount() - 1);
        Chip chip = new Chip(((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).getContext(), null);
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(str);
        chip.setCheckable(true);
        chip.setGravity(17);
        Context context = getContext();
        kotlin.jvm.internal.i.d(context);
        chip.setTextColor(g0.a.b(context, R.color.title_high_contrast));
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setChipMinHeightResource(R.dimen._32sdp);
        chip.setChipBackgroundColorResource(R.color.white);
        chip.setChipStrokeColorResource(R.color.title_high_contrast);
        chip.setChipStrokeWidthResource(R.dimen._1sdp);
        chip.setChipCornerRadiusResource(R.dimen.margin_8);
        chip.setChipStartPaddingResource(R.dimen.margin_16);
        chip.setChipEndPaddingResource(R.dimen.margin_16);
        chip.setOnCheckedChangeListener(this);
        chip.setOnCloseIconClickListener(new nn.g(15, this, chip, str));
        if (z10) {
            chip.setCloseIconResource(R.drawable.ic_remove_circle_black_outline);
            chip.setCloseIconVisible(true);
            ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).removeViewAt(((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).getChildCount() - 1);
            ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).addView(chip);
            ((ChipGroup) _$_findCachedViewById(R.id.chipGroupAdd)).addView(childAt);
            chip.setChecked(true);
            this.f28766x.add(str);
            return;
        }
        chip.setCloseIconVisible(false);
        ((ChipGroup) _$_findCachedViewById(R.id.chipGroupPre)).addView(chip);
    }

    public final void M() {
        Dialog styledDialog = UiUtils.Companion.getStyledDialog(R.layout.dialog_screen_a22_search, getActivity(), R.style.Theme_Dialog_Fullscreen);
        View childAt = ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).getChildAt(0);
        kotlin.jvm.internal.i.e(childAt, "null cannot be cast to non-null type com.theinnerhour.b2b.widgets.RobertoTextView");
        RobertoTextView robertoTextView = (RobertoTextView) childAt;
        ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).removeViewAt(0);
        Iterator<String> it = this.f28765w.iterator();
        while (it.hasNext()) {
            String next = it.next();
            HashMap<String, Boolean> hashMap = this.A;
            if (hashMap.get(next) != null) {
                Boolean bool = hashMap.get(next);
                kotlin.jvm.internal.i.d(bool);
                if (!bool.booleanValue()) {
                    View inflate = getLayoutInflater().inflate(R.layout.grounding_picker_option_row, (ViewGroup) ((LinearLayout) _$_findCachedViewById(R.id.optionsContainerLayout)), false);
                    ((RobertoTextView) inflate.findViewById(R.id.optionTitle)).setText(next);
                    inflate.setOnClickListener(new nn.g(this, gv.r.i1(((RobertoTextView) inflate.findViewById(R.id.optionTitle)).getText().toString()).toString(), styledDialog, 14));
                    ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(inflate);
                }
            }
        }
        ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).addTextChangedListener(new a(styledDialog));
        ((RobertoEditText) styledDialog.findViewById(R.id.editTextOption)).setOnEditorActionListener(new oq.l(styledDialog, this, 1));
        robertoTextView.setOnClickListener(new ho.o(styledDialog, 21, this));
        ((LinearLayout) styledDialog.findViewById(R.id.optionsContainerLayout)).addView(robertoTextView);
        robertoTextView.setText(getString(R.string.depressionMasteryChipADD));
        Window window = styledDialog.getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        styledDialog.show();
        ((AppCompatImageView) styledDialog.findViewById(R.id.btnSelectionBack)).setOnClickListener(new nq.n(styledDialog, 3));
    }

    public final View _$_findCachedViewById(int i6) {
        View findViewById;
        LinkedHashMap linkedHashMap = this.B;
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

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z10) {
        if (z10) {
            kotlin.jvm.internal.i.e(compoundButton, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Chip chip = (Chip) compoundButton;
            Context context = getContext();
            kotlin.jvm.internal.i.d(context);
            chip.setTextColor(g0.a.b(context, R.color.white));
            chip.setChipStrokeColorResource(R.color.sea);
            chip.setChipBackgroundColorResource(R.color.sea);
            chip.setCloseIconResource(R.drawable.ic_remove_circle_black);
            this.f28764v = chip.getText().toString();
        } else {
            kotlin.jvm.internal.i.e(compoundButton, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            Chip chip2 = (Chip) compoundButton;
            Context context2 = getContext();
            kotlin.jvm.internal.i.d(context2);
            chip2.setTextColor(g0.a.b(context2, R.color.title_high_contrast));
            chip2.setChipStrokeColorResource(R.color.title_high_contrast);
            chip2.setChipBackgroundColorResource(R.color.white);
            chip2.setCloseIconResource(R.drawable.ic_remove_circle_black_outline);
        }
        Chip chip3 = (Chip) compoundButton;
        Chip chip4 = this.f28767y;
        if (chip4 == null) {
            this.f28767y = chip3;
            J(true);
        } else if (!kotlin.jvm.internal.i.b(chip4, chip3)) {
            Chip chip5 = this.f28767y;
            kotlin.jvm.internal.i.e(chip5, "null cannot be cast to non-null type com.google.android.material.chip.Chip");
            chip5.setChecked(false);
            this.f28767y = chip3;
            J(true);
        } else {
            J(z10);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle bundle) {
        kotlin.jvm.internal.i.g(inflater, "inflater");
        return inflater.inflate(R.layout.fragment_screen_a22, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.B.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        kotlin.jvm.internal.i.g(view, "view");
        super.onViewCreated(view, bundle);
        try {
            InsetsUtils insetsUtils = InsetsUtils.INSTANCE;
            RobertoTextView pickPrompt = (RobertoTextView) _$_findCachedViewById(R.id.pickPrompt);
            kotlin.jvm.internal.i.f(pickPrompt, "pickPrompt");
            insetsUtils.addStatusBarHeight(pickPrompt);
            ((RobertoTextView) _$_findCachedViewById(R.id.pickPrompt)).setText(getString(R.string.depressionMasteryPickerHeader));
            ((RobertoTextView) _$_findCachedViewById(R.id.pickDesc)).setText(getString(R.string.depressionMasteryPickerSubheader));
            ArrayList<String> arrayList = this.f28765w;
            arrayList.add(getString(R.string.depressionMasteryPickerSearch1));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch2));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch3));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch4));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch5));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch6));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch7));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch8));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch9));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch10));
            arrayList.add(getString(R.string.depressionMasteryPickerSearch11));
            ArrayList<String> arrayList2 = this.f28766x;
            arrayList2.add(getString(R.string.depressionMasteryPicker1));
            arrayList2.add(getString(R.string.depressionMasteryPicker2));
            arrayList2.add(getString(R.string.depressionMasteryPicker3));
            arrayList2.add(getString(R.string.depressionMasteryPicker4));
            arrayList2.add(getString(R.string.depressionMasteryPicker5));
            arrayList2.add(getString(R.string.depressionMasteryPicker6));
            arrayList2.add(getString(R.string.depressionMasteryPicker7));
            arrayList2.add(getString(R.string.depressionMasteryPicker8));
            HashMap<String, Boolean> hashMap = this.A;
            for (Object obj : arrayList) {
                String str = (String) obj;
                String str2 = (String) obj;
                hashMap.put(str, Boolean.FALSE);
            }
            Iterator<String> it = arrayList2.iterator();
            kotlin.jvm.internal.i.f(it, "chipsList.iterator()");
            while (it.hasNext()) {
                String chip = it.next();
                kotlin.jvm.internal.i.f(chip, "chip");
                K(chip, false);
            }
            ((Chip) _$_findCachedViewById(R.id.addChip)).setOnCloseIconClickListener(new View.OnClickListener(this) { // from class: pq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f28751v;

                {
                    this.f28751v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f28751v;
                    switch (i6) {
                        case 0:
                            int i10 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 1:
                            int i11 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        default:
                            int i12 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.f28768z) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                String str3 = this$0.f28764v;
                                kotlin.jvm.internal.i.g(str3, "<set-?>");
                                ((DepressionMasteryActivity) activity).E = str3;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                ((DepressionMasteryActivity) activity2).t0();
                                return;
                            }
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionMasteryPickerError), 0).show();
                            return;
                    }
                }
            });
            ((Chip) _$_findCachedViewById(R.id.addChip)).setOnClickListener(new View.OnClickListener(this) { // from class: pq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f28751v;

                {
                    this.f28751v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f28751v;
                    switch (i6) {
                        case 0:
                            int i10 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 1:
                            int i11 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        default:
                            int i12 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.f28768z) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                String str3 = this$0.f28764v;
                                kotlin.jvm.internal.i.g(str3, "<set-?>");
                                ((DepressionMasteryActivity) activity).E = str3;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                ((DepressionMasteryActivity) activity2).t0();
                                return;
                            }
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionMasteryPickerError), 0).show();
                            return;
                    }
                }
            });
            J(false);
            ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setText(getString(R.string.depressionMasteryPickerDone));
            ((RobertoButton) _$_findCachedViewById(R.id.btnContinue)).setOnClickListener(new View.OnClickListener(this) { // from class: pq.a

                /* renamed from: v  reason: collision with root package name */
                public final /* synthetic */ b f28751v;

                {
                    this.f28751v = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    int i6 = r2;
                    b this$0 = this.f28751v;
                    switch (i6) {
                        case 0:
                            int i10 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        case 1:
                            int i11 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            this$0.M();
                            return;
                        default:
                            int i12 = b.C;
                            kotlin.jvm.internal.i.g(this$0, "this$0");
                            if (this$0.f28768z) {
                                androidx.fragment.app.p activity = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                String str3 = this$0.f28764v;
                                kotlin.jvm.internal.i.g(str3, "<set-?>");
                                ((DepressionMasteryActivity) activity).E = str3;
                                androidx.fragment.app.p activity2 = this$0.getActivity();
                                kotlin.jvm.internal.i.e(activity2, "null cannot be cast to non-null type com.theinnerhour.b2b.activity.DepressionMasteryActivity");
                                ((DepressionMasteryActivity) activity2).t0();
                                return;
                            }
                            Toast.makeText(this$0.getActivity(), this$0.getString(R.string.depressionMasteryPickerError), 0).show();
                            return;
                    }
                }
            });
        } catch (Exception e10) {
            LogHelper.INSTANCE.e(this.f28763u, e10);
        }
    }

    /* compiled from: DepressionMasteryChipFragment.kt */
    /* loaded from: classes2.dex */
    public static final class a implements TextWatcher {

        /* renamed from: v  reason: collision with root package name */
        public final /* synthetic */ Dialog f28770v;

        public a(Dialog dialog) {
            this.f28770v = dialog;
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
            int i12;
            Dialog dialog = this.f28770v;
            String lowerCase = String.valueOf(((RobertoEditText) dialog.findViewById(R.id.editTextOption)).getText()).toLowerCase();
            kotlin.jvm.internal.i.f(lowerCase, "this as java.lang.String).toLowerCase()");
            int i13 = b.C;
            b bVar = b.this;
            bVar.getClass();
            try {
                int childCount = ((LinearLayout) dialog.findViewById(R.id.optionsContainerLayout)).getChildCount() - 1;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt = ((LinearLayout) dialog.findViewById(R.id.optionsContainerLayout)).getChildAt(i14);
                    String lowerCase2 = ((RobertoTextView) childAt.findViewById(R.id.optionTitle)).getText().toString().toLowerCase();
                    kotlin.jvm.internal.i.f(lowerCase2, "this as java.lang.String).toLowerCase()");
                    if (gv.r.J0(lowerCase2, lowerCase)) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    childAt.setVisibility(i12);
                }
            } catch (Exception e10) {
                LogHelper.INSTANCE.e(bVar.f28763u, e10.toString());
            }
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i6, int i10, int i11) {
        }
    }
}
