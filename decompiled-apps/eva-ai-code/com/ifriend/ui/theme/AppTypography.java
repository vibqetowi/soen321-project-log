package com.ifriend.ui.theme;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import androidx.compose.ui.text.PlatformTextStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.Hyphens;
import androidx.compose.ui.text.style.LineBreak;
import androidx.compose.ui.text.style.LineHeightStyle;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextDirection;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.text.style.TextIndent;
import androidx.compose.ui.text.style.TextMotion;
import androidx.compose.ui.unit.TextUnitKt;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: AppTypography.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0003¢\u0006\u0002\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003Jm\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003HÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020(HÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006+"}, d2 = {"Lcom/ifriend/ui/theme/AppTypography;", "", "button", "Landroidx/compose/ui/text/TextStyle;", "titleItem", "titleItemMedium", "titleItemSemiBold", "titleItemBold", "descriptionItem", "descriptionItemBold", "screenTitleSemiBold", "chatText", "purchaseFooterText", "(Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;Landroidx/compose/ui/text/TextStyle;)V", "getButton", "()Landroidx/compose/ui/text/TextStyle;", "getChatText", "getDescriptionItem", "getDescriptionItemBold", "getPurchaseFooterText", "getScreenTitleSemiBold", "getTitleItem", "getTitleItemBold", "getTitleItemMedium", "getTitleItemSemiBold", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppTypography {
    public static final int $stable = 0;
    private final TextStyle button;
    private final TextStyle chatText;
    private final TextStyle descriptionItem;
    private final TextStyle descriptionItemBold;
    private final TextStyle purchaseFooterText;
    private final TextStyle screenTitleSemiBold;
    private final TextStyle titleItem;
    private final TextStyle titleItemBold;
    private final TextStyle titleItemMedium;
    private final TextStyle titleItemSemiBold;

    public AppTypography() {
        this(null, null, null, null, null, null, null, null, null, null, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public final TextStyle component1() {
        return this.button;
    }

    public final TextStyle component10() {
        return this.purchaseFooterText;
    }

    public final TextStyle component2() {
        return this.titleItem;
    }

    public final TextStyle component3() {
        return this.titleItemMedium;
    }

    public final TextStyle component4() {
        return this.titleItemSemiBold;
    }

    public final TextStyle component5() {
        return this.titleItemBold;
    }

    public final TextStyle component6() {
        return this.descriptionItem;
    }

    public final TextStyle component7() {
        return this.descriptionItemBold;
    }

    public final TextStyle component8() {
        return this.screenTitleSemiBold;
    }

    public final TextStyle component9() {
        return this.chatText;
    }

    public final AppTypography copy(TextStyle button, TextStyle titleItem, TextStyle titleItemMedium, TextStyle titleItemSemiBold, TextStyle titleItemBold, TextStyle descriptionItem, TextStyle descriptionItemBold, TextStyle screenTitleSemiBold, TextStyle chatText, TextStyle purchaseFooterText) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(titleItem, "titleItem");
        Intrinsics.checkNotNullParameter(titleItemMedium, "titleItemMedium");
        Intrinsics.checkNotNullParameter(titleItemSemiBold, "titleItemSemiBold");
        Intrinsics.checkNotNullParameter(titleItemBold, "titleItemBold");
        Intrinsics.checkNotNullParameter(descriptionItem, "descriptionItem");
        Intrinsics.checkNotNullParameter(descriptionItemBold, "descriptionItemBold");
        Intrinsics.checkNotNullParameter(screenTitleSemiBold, "screenTitleSemiBold");
        Intrinsics.checkNotNullParameter(chatText, "chatText");
        Intrinsics.checkNotNullParameter(purchaseFooterText, "purchaseFooterText");
        return new AppTypography(button, titleItem, titleItemMedium, titleItemSemiBold, titleItemBold, descriptionItem, descriptionItemBold, screenTitleSemiBold, chatText, purchaseFooterText);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof AppTypography) {
            AppTypography appTypography = (AppTypography) obj;
            return Intrinsics.areEqual(this.button, appTypography.button) && Intrinsics.areEqual(this.titleItem, appTypography.titleItem) && Intrinsics.areEqual(this.titleItemMedium, appTypography.titleItemMedium) && Intrinsics.areEqual(this.titleItemSemiBold, appTypography.titleItemSemiBold) && Intrinsics.areEqual(this.titleItemBold, appTypography.titleItemBold) && Intrinsics.areEqual(this.descriptionItem, appTypography.descriptionItem) && Intrinsics.areEqual(this.descriptionItemBold, appTypography.descriptionItemBold) && Intrinsics.areEqual(this.screenTitleSemiBold, appTypography.screenTitleSemiBold) && Intrinsics.areEqual(this.chatText, appTypography.chatText) && Intrinsics.areEqual(this.purchaseFooterText, appTypography.purchaseFooterText);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((this.button.hashCode() * 31) + this.titleItem.hashCode()) * 31) + this.titleItemMedium.hashCode()) * 31) + this.titleItemSemiBold.hashCode()) * 31) + this.titleItemBold.hashCode()) * 31) + this.descriptionItem.hashCode()) * 31) + this.descriptionItemBold.hashCode()) * 31) + this.screenTitleSemiBold.hashCode()) * 31) + this.chatText.hashCode()) * 31) + this.purchaseFooterText.hashCode();
    }

    public String toString() {
        TextStyle textStyle = this.button;
        TextStyle textStyle2 = this.titleItem;
        TextStyle textStyle3 = this.titleItemMedium;
        TextStyle textStyle4 = this.titleItemSemiBold;
        TextStyle textStyle5 = this.titleItemBold;
        TextStyle textStyle6 = this.descriptionItem;
        TextStyle textStyle7 = this.descriptionItemBold;
        TextStyle textStyle8 = this.screenTitleSemiBold;
        TextStyle textStyle9 = this.chatText;
        TextStyle textStyle10 = this.purchaseFooterText;
        return "AppTypography(button=" + textStyle + ", titleItem=" + textStyle2 + ", titleItemMedium=" + textStyle3 + ", titleItemSemiBold=" + textStyle4 + ", titleItemBold=" + textStyle5 + ", descriptionItem=" + textStyle6 + ", descriptionItemBold=" + textStyle7 + ", screenTitleSemiBold=" + textStyle8 + ", chatText=" + textStyle9 + ", purchaseFooterText=" + textStyle10 + ")";
    }

    public AppTypography(TextStyle button, TextStyle titleItem, TextStyle titleItemMedium, TextStyle titleItemSemiBold, TextStyle titleItemBold, TextStyle descriptionItem, TextStyle descriptionItemBold, TextStyle screenTitleSemiBold, TextStyle chatText, TextStyle purchaseFooterText) {
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(titleItem, "titleItem");
        Intrinsics.checkNotNullParameter(titleItemMedium, "titleItemMedium");
        Intrinsics.checkNotNullParameter(titleItemSemiBold, "titleItemSemiBold");
        Intrinsics.checkNotNullParameter(titleItemBold, "titleItemBold");
        Intrinsics.checkNotNullParameter(descriptionItem, "descriptionItem");
        Intrinsics.checkNotNullParameter(descriptionItemBold, "descriptionItemBold");
        Intrinsics.checkNotNullParameter(screenTitleSemiBold, "screenTitleSemiBold");
        Intrinsics.checkNotNullParameter(chatText, "chatText");
        Intrinsics.checkNotNullParameter(purchaseFooterText, "purchaseFooterText");
        this.button = button;
        this.titleItem = titleItem;
        this.titleItemMedium = titleItemMedium;
        this.titleItemSemiBold = titleItemSemiBold;
        this.titleItemBold = titleItemBold;
        this.descriptionItem = descriptionItem;
        this.descriptionItemBold = descriptionItemBold;
        this.screenTitleSemiBold = screenTitleSemiBold;
        this.chatText = chatText;
        this.purchaseFooterText = purchaseFooterText;
    }

    public final TextStyle getButton() {
        return this.button;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AppTypography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(r1, r3, r6, r7, r2, r4, r5, r9, r8, r0);
        TextStyle textStyle11;
        TextStyle textStyle12;
        TextStyle textStyle13;
        TextStyle textStyle14;
        TextStyle textStyle15;
        TextStyle textStyle16;
        TextStyle textStyle17;
        TextStyle textStyle18;
        TextStyle textStyle19;
        TextStyle textStyle20;
        if ((i & 1) != 0) {
            FontFamily generalSans = AppFontFamily.INSTANCE.getGeneralSans();
            textStyle11 = new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, generalSans, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(16), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle11 = textStyle;
        }
        if ((i & 2) != 0) {
            FontFamily generalSans2 = AppFontFamily.INSTANCE.getGeneralSans();
            textStyle12 = new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, generalSans2, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(21.6d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle12 = textStyle2;
        }
        if ((i & 4) != 0) {
            FontFamily generalSans3 = AppFontFamily.INSTANCE.getGeneralSans();
            textStyle13 = new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getMedium(), (FontStyle) null, (FontSynthesis) null, generalSans3, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(21.6d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle13 = textStyle3;
        }
        if ((i & 8) != 0) {
            FontFamily generalSans4 = AppFontFamily.INSTANCE.getGeneralSans();
            textStyle14 = new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, generalSans4, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(21.6d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle14 = textStyle4;
        }
        if ((i & 16) != 0) {
            FontFamily generalSans5 = AppFontFamily.INSTANCE.getGeneralSans();
            textStyle15 = new TextStyle(0L, TextUnitKt.getSp(16), FontWeight.Companion.getBold(), (FontStyle) null, (FontSynthesis) null, generalSans5, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(21.6d), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle15 = textStyle5;
        }
        if ((i & 32) != 0) {
            FontFamily generalSans6 = AppFontFamily.INSTANCE.getGeneralSans();
            textStyle16 = new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, generalSans6, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle16 = textStyle6;
        }
        if ((i & 64) != 0) {
            FontFamily generalSans7 = AppFontFamily.INSTANCE.getGeneralSans();
            textStyle17 = new TextStyle(0L, TextUnitKt.getSp(14), FontWeight.Companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, generalSans7, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(18), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle17 = textStyle7;
        }
        if ((i & 128) != 0) {
            FontFamily generalSans8 = AppFontFamily.INSTANCE.getGeneralSans();
            textStyle18 = new TextStyle(0L, TextUnitKt.getSp(32), FontWeight.Companion.getSemiBold(), (FontStyle) null, (FontSynthesis) null, generalSans8, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(32), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle18 = textStyle8;
        }
        if ((i & 256) != 0) {
            FontFamily ibmSans = AppFontFamily.INSTANCE.getIbmSans();
            textStyle19 = new TextStyle(0L, TextUnitKt.getSp(18), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, ibmSans, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, TextUnitKt.getSp(21), (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16646105, (DefaultConstructorMarker) null);
        } else {
            textStyle19 = textStyle9;
        }
        if ((i & 512) != 0) {
            textStyle20 = new TextStyle(0L, TextUnitKt.getSp(9), FontWeight.Companion.getNormal(), (FontStyle) null, (FontSynthesis) null, AppFontFamily.INSTANCE.getGhino(), (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (DrawStyle) null, (TextAlign) null, (TextDirection) null, 0L, (TextIndent) null, (PlatformTextStyle) null, (LineHeightStyle) null, (LineBreak) null, (Hyphens) null, (TextMotion) null, 16777177, (DefaultConstructorMarker) null);
        } else {
            textStyle20 = textStyle10;
        }
    }

    public final TextStyle getTitleItem() {
        return this.titleItem;
    }

    public final TextStyle getTitleItemMedium() {
        return this.titleItemMedium;
    }

    public final TextStyle getTitleItemSemiBold() {
        return this.titleItemSemiBold;
    }

    public final TextStyle getTitleItemBold() {
        return this.titleItemBold;
    }

    public final TextStyle getDescriptionItem() {
        return this.descriptionItem;
    }

    public final TextStyle getDescriptionItemBold() {
        return this.descriptionItemBold;
    }

    public final TextStyle getScreenTitleSemiBold() {
        return this.screenTitleSemiBold;
    }

    public final TextStyle getChatText() {
        return this.chatText;
    }

    public final TextStyle getPurchaseFooterText() {
        return this.purchaseFooterText;
    }
}
