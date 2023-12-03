package bn;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipGroup;
import com.theinnerhour.b2b.R;
import com.theinnerhour.b2b.utils.AssetProviderSingleton;
import com.theinnerhour.b2b.utils.LogHelper;
import kotlin.jvm.internal.i;
/* compiled from: LibraryChipUtils.kt */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f4534a = 0;

    static {
        LogHelper.INSTANCE.makeLogTag("LibraryChipUtils");
    }

    public static Chip a(String chipTitle, ChipGroup chipGroup, String str, String str2) {
        Chip chip;
        i.g(chipTitle, "chipTitle");
        i.g(chipGroup, "chipGroup");
        View inflate = LayoutInflater.from(chipGroup.getContext()).inflate(R.layout.chip_textsize_12, (ViewGroup) chipGroup, false);
        if (inflate instanceof Chip) {
            chip = (Chip) inflate;
        } else {
            chip = null;
        }
        if (chip == null) {
            return null;
        }
        chip.setPadding(24, 12, 24, 12);
        AssetProviderSingleton assetProviderSingleton = AssetProviderSingleton.INSTANCE;
        Context context = chipGroup.getContext();
        i.f(context, "chipGroup.context");
        chip.setTypeface(assetProviderSingleton.getTypeface(context, "Lato-Bold.ttf"));
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(chipTitle);
        chip.setCheckable(false);
        chip.setGravity(1);
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setChipStrokeWidthResource(R.dimen._1sdp);
        chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 6.0f, chip.getContext().getResources().getDisplayMetrics())));
        chip.setChecked(false);
        chip.setEnsureMinTouchTargetSize(false);
        if (str != null) {
            chip.setTextColor(ColorStateList.valueOf(Color.parseColor(str)));
            chip.setChipBackgroundColor(ColorStateList.valueOf(Color.parseColor(str2)));
            chip.setChipStrokeColor(ColorStateList.valueOf(Color.parseColor(str)));
        }
        return chip;
    }

    public static Chip b(Context context, ChipGroup chipGroup, String chipTitle) {
        Chip chip;
        i.g(chipTitle, "chipTitle");
        i.g(context, "context");
        View inflate = LayoutInflater.from(chipGroup.getContext()).inflate(R.layout.chip_textsize_10, (ViewGroup) chipGroup, false);
        if (inflate instanceof Chip) {
            chip = (Chip) inflate;
        } else {
            chip = null;
        }
        if (chip == null) {
            return null;
        }
        chip.setPadding(0, 12, 0, 12);
        chip.setMinHeight(0);
        chip.setMinimumHeight(0);
        chip.setTypeface(AssetProviderSingleton.INSTANCE.getTypeface(context, "Lato-Bold.ttf"));
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(chipTitle);
        chip.setTag(chipTitle);
        chip.setAllCaps(true);
        chip.setCheckable(true);
        chip.setGravity(1);
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setChipStrokeWidthResource(R.dimen._1sdp);
        chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 18.0f, context.getResources().getDisplayMetrics())));
        chip.setChipStartPaddingResource(R.dimen.margin_8);
        chip.setChipEndPaddingResource(R.dimen.margin_8);
        chip.setIconStartPadding(0.0f);
        chip.setChipIconSize(0.0f);
        chip.setIconEndPadding(0.0f);
        chip.setMinimumWidth(0);
        chip.setTextStartPaddingResource(R.dimen.margin_8);
        chip.setTextEndPaddingResource(R.dimen.margin_8);
        chip.setCloseIconStartPadding(0.0f);
        chip.setCloseIconEndPadding(0.0f);
        chip.setCloseIconSize(0.0f);
        chip.setTextColor(g0.a.b(context, R.color.title_high_contrast));
        chip.setChipBackgroundColorResource(R.color.white);
        chip.setChipStrokeColorResource(R.color.title_high_contrast_35_opacity);
        chip.setChecked(false);
        chip.setLetterSpacing(0.17f);
        chip.setEnsureMinTouchTargetSize(false);
        return chip;
    }

    public static Chip c(Context context, ChipGroup chipGroup, String chipTitle) {
        Chip chip;
        i.g(chipTitle, "chipTitle");
        View inflate = LayoutInflater.from(chipGroup.getContext()).inflate(R.layout.chip_textsize_10, (ViewGroup) chipGroup, false);
        if (inflate instanceof Chip) {
            chip = (Chip) inflate;
        } else {
            chip = null;
        }
        if (chip == null) {
            return null;
        }
        chip.setPadding(0, 20, 0, 20);
        chip.setMinHeight(0);
        chip.setMinimumHeight(0);
        chip.setTypeface(AssetProviderSingleton.INSTANCE.getTypeface(context, "Lato-Bold.ttf"));
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(chipTitle);
        chip.setTag(chipTitle);
        chip.setAllCaps(true);
        chip.setCheckable(true);
        chip.setGravity(1);
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setChipStrokeWidthResource(R.dimen._1sdp);
        chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 18.0f, context.getResources().getDisplayMetrics())));
        chip.setChipStartPaddingResource(R.dimen.margin_8);
        chip.setChipEndPaddingResource(R.dimen.margin_8);
        chip.setIconStartPadding(0.0f);
        chip.setChipIconSize(0.0f);
        chip.setIconEndPadding(0.0f);
        chip.setMinimumWidth(0);
        chip.setTextStartPaddingResource(R.dimen.margin_8);
        chip.setTextEndPaddingResource(R.dimen.margin_8);
        chip.setCloseIconStartPadding(0.0f);
        chip.setCloseIconEndPadding(0.0f);
        chip.setCloseIconSize(0.0f);
        chip.setTextColor(g0.a.b(context, R.color.title_high_contrast));
        chip.setChipBackgroundColorResource(R.color.white);
        chip.setChipStrokeColorResource(R.color.proDashboardFooter);
        chip.setChecked(false);
        chip.setLetterSpacing(0.17f);
        chip.setEnsureMinTouchTargetSize(false);
        return chip;
    }

    public static Chip d(Context context, ChipGroup chipGroup, String str) {
        Chip chip;
        View inflate = LayoutInflater.from(chipGroup.getContext()).inflate(R.layout.chip_textsize_12, (ViewGroup) chipGroup, false);
        if (inflate instanceof Chip) {
            chip = (Chip) inflate;
        } else {
            chip = null;
        }
        if (chip == null) {
            return null;
        }
        chip.setPadding(24, 12, 24, 12);
        chip.setMinHeight(0);
        chip.setMinimumHeight(0);
        chip.setTypeface(AssetProviderSingleton.INSTANCE.getTypeface(context, "Lato-Bold.ttf"));
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(str);
        chip.setCheckable(true);
        chip.setGravity(1);
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setEnsureMinTouchTargetSize(false);
        chip.setChipStrokeWidthResource(R.dimen._1sdp);
        chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 4.0f, context.getResources().getDisplayMetrics())));
        chip.setIconStartPadding(0.0f);
        chip.setChipIconSize(0.0f);
        chip.setIconEndPadding(0.0f);
        chip.setMinimumWidth(0);
        chip.setCloseIconStartPadding(0.0f);
        chip.setCloseIconEndPadding(0.0f);
        chip.setCloseIconSize(0.0f);
        chip.setTextColor(g0.a.b(context, R.color.libraryShortCoursesBackgroundDark));
        chip.setChipBackgroundColorResource(R.color.ShortCoursesDayFeatureBackground);
        chip.setChipStrokeColorResource(R.color.libraryShortCoursesBackgroundDark);
        chip.setChecked(false);
        chip.setLetterSpacing(0.02f);
        chip.setEnsureMinTouchTargetSize(false);
        return chip;
    }

    public static Chip e(Context context, ChipGroup chipGroup, String chipTitle) {
        Chip chip;
        i.g(chipTitle, "chipTitle");
        View inflate = LayoutInflater.from(chipGroup.getContext()).inflate(R.layout.chip_textsize_10_journal, (ViewGroup) chipGroup, false);
        if (inflate instanceof Chip) {
            chip = (Chip) inflate;
        } else {
            chip = null;
        }
        if (chip == null) {
            return null;
        }
        chip.setPadding(40, 20, 40, 20);
        AssetProviderSingleton assetProviderSingleton = AssetProviderSingleton.INSTANCE;
        Context context2 = chipGroup.getContext();
        i.f(context2, "chipGroup.context");
        chip.setTypeface(assetProviderSingleton.getTypeface(context2, "Quicksand-Bold.ttf"));
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(chipTitle);
        chip.setCheckable(true);
        chip.setGravity(1);
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setAllCaps(true);
        chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 16.0f, context.getResources().getDisplayMetrics())));
        chip.setChipStrokeWidthResource(R.dimen._1sdp);
        chip.setEnsureMinTouchTargetSize(false);
        chip.setChipStartPaddingResource(R.dimen.margin_8);
        chip.setChipEndPaddingResource(R.dimen.margin_8);
        return chip;
    }

    public static Chip f(Context context, ChipGroup chipGroup, String chipTitle) {
        Chip chip;
        i.g(chipTitle, "chipTitle");
        i.g(context, "context");
        View inflate = LayoutInflater.from(chipGroup.getContext()).inflate(R.layout.chip_textsize_14, (ViewGroup) chipGroup, false);
        if (inflate instanceof Chip) {
            chip = (Chip) inflate;
        } else {
            chip = null;
        }
        if (chip == null) {
            return null;
        }
        chip.setPadding(50, 25, 50, 25);
        chip.setMinHeight(0);
        chip.setMinimumHeight(0);
        chip.setTypeface(AssetProviderSingleton.INSTANCE.getTypeface(context, "Lato-Bold.ttf"));
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(chipTitle);
        chip.setTag(chipTitle);
        chip.setCheckable(true);
        chip.setGravity(1);
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setChipStrokeWidthResource(R.dimen._1sdp);
        chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 18.0f, context.getResources().getDisplayMetrics())));
        chip.setTextColor(g0.a.b(context, R.color.title_high_contrast));
        chip.setChipBackgroundColorResource(R.color.white);
        chip.setChipStrokeColorResource(R.color.title_high_contrast);
        chip.setChecked(false);
        chip.setLetterSpacing(0.02f);
        chip.setEnsureMinTouchTargetSize(false);
        return chip;
    }

    public static Chip g(p pVar, String chipTitle, ChipGroup chipGroup, String str) {
        Chip chip;
        i.g(chipTitle, "chipTitle");
        View inflate = LayoutInflater.from(chipGroup.getContext()).inflate(R.layout.chip_textsize_12, (ViewGroup) chipGroup, false);
        if (inflate instanceof Chip) {
            chip = (Chip) inflate;
        } else {
            chip = null;
        }
        if (chip == null) {
            return null;
        }
        chip.setPadding(64, 32, 64, 32);
        AssetProviderSingleton assetProviderSingleton = AssetProviderSingleton.INSTANCE;
        Context context = chipGroup.getContext();
        i.f(context, "chipGroup.context");
        chip.setTypeface(assetProviderSingleton.getTypeface(context, "Quicksand-Bold.ttf"));
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(chipTitle);
        chip.setCheckable(false);
        chip.setRippleColorResource(R.color.transparent);
        chip.setGravity(1);
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 8.0f, pVar.getResources().getDisplayMetrics())));
        chip.setChecked(false);
        chip.setEnsureMinTouchTargetSize(false);
        chip.setTextColor(g0.a.b(pVar, R.color.amahaDarkGray));
        chip.setChipBackgroundColorResource(R.color.amahaLightOrange);
        return chip;
    }

    public static Chip h(Context context, String chipTitle, ChipGroup chipGroup, boolean z10, hs.f fVar) {
        Chip chip;
        i.g(context, "context");
        i.g(chipTitle, "chipTitle");
        View inflate = LayoutInflater.from(chipGroup.getContext()).inflate(R.layout.chip_textsize_14, (ViewGroup) chipGroup, false);
        if (inflate instanceof Chip) {
            chip = (Chip) inflate;
        } else {
            chip = null;
        }
        if (chip == null) {
            return null;
        }
        if (fVar != null) {
            Number number = (Number) fVar.f19464u;
            int intValue = number.intValue();
            Number number2 = (Number) fVar.f19465v;
            chip.setPadding(intValue, number2.intValue(), number.intValue(), number2.intValue());
        } else {
            chip.setPadding(32, 16, 32, 16);
        }
        AssetProviderSingleton assetProviderSingleton = AssetProviderSingleton.INSTANCE;
        Context context2 = chipGroup.getContext();
        i.f(context2, "chipGroup.context");
        chip.setTypeface(assetProviderSingleton.getTypeface(context2, "Quicksand-Bold.ttf"));
        chip.setLayoutParams(new ChipGroup.b());
        chip.setText(chipTitle);
        chip.setCheckable(true);
        chip.setGravity(1);
        chip.setCheckedIconVisible(false);
        chip.setChipIconVisible(false);
        chip.setCloseIconVisible(false);
        chip.setCloseIconTint(null);
        chip.setShapeAppearanceModel(new yb.i().e(TypedValue.applyDimension(1, 8.0f, context.getResources().getDisplayMetrics())));
        chip.setChecked(z10);
        chip.setChipStrokeWidthResource(R.dimen._1sdp);
        chip.setEnsureMinTouchTargetSize(false);
        if (z10) {
            chip.setChipBackgroundColorResource(R.color.amahaLightGreen);
            chip.setChipStrokeColorResource(R.color.amahaLightGreen);
            chip.setTextColor(g0.a.b(context, R.color.amahaGreen));
            Context context3 = chipGroup.getContext();
            i.f(context3, "chipGroup.context");
            chip.setTypeface(assetProviderSingleton.getTypeface(context3, "Quicksand-Bold.ttf"));
        } else {
            chip.setTextColor(g0.a.b(context, R.color.amahaDarkGray));
            chip.setChipStrokeColorResource(R.color.proDashboardFooter);
            chip.setChipBackgroundColorResource(R.color.white);
            Context context4 = chipGroup.getContext();
            i.f(context4, "chipGroup.context");
            chip.setTypeface(assetProviderSingleton.getTypeface(context4, "Quicksand-Medium.ttf"));
        }
        return chip;
    }
}
