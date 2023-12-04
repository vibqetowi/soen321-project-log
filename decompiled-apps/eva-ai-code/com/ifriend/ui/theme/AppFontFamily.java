package com.ifriend.ui.theme;

import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontFamilyKt;
import androidx.compose.ui.text.font.FontKt;
import androidx.compose.ui.text.font.FontWeight;
import com.ifriend.ui.R;
import kotlin.Metadata;
/* compiled from: AppTypography.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006¨\u0006\r"}, d2 = {"Lcom/ifriend/ui/theme/AppFontFamily;", "", "()V", "GeneralSans", "Landroidx/compose/ui/text/font/FontFamily;", "getGeneralSans", "()Landroidx/compose/ui/text/font/FontFamily;", "Ghino", "getGhino", "IbmSans", "getIbmSans", "SfProDisplay", "getSfProDisplay", "common_ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AppFontFamily {
    public static final int $stable = 0;
    public static final AppFontFamily INSTANCE = new AppFontFamily();
    private static final FontFamily Ghino = FontFamilyKt.FontFamily(FontKt.m5185FontYpTlLL0$default(R.font.ghino_regular, FontWeight.Companion.getNormal(), 0, 0, 12, null), FontKt.m5185FontYpTlLL0$default(R.font.ghino_bold, FontWeight.Companion.getBold(), 0, 0, 12, null), FontKt.m5185FontYpTlLL0$default(R.font.ghino_black, FontWeight.Companion.getBlack(), 0, 0, 12, null), FontKt.m5185FontYpTlLL0$default(R.font.ghino_extra_bold, FontWeight.Companion.getExtraBold(), 0, 0, 12, null));
    private static final FontFamily IbmSans = FontFamilyKt.FontFamily(FontKt.m5185FontYpTlLL0$default(R.font.ibm_regular, FontWeight.Companion.getNormal(), 0, 0, 12, null), FontKt.m5185FontYpTlLL0$default(R.font.ibm_bold, FontWeight.Companion.getBold(), 0, 0, 12, null), FontKt.m5185FontYpTlLL0$default(R.font.ibm_semi_bold, FontWeight.Companion.getSemiBold(), 0, 0, 12, null));
    private static final FontFamily SfProDisplay = FontFamilyKt.FontFamily(FontKt.m5185FontYpTlLL0$default(R.font.sf_pro_regular, FontWeight.Companion.getNormal(), 0, 0, 12, null), FontKt.m5185FontYpTlLL0$default(R.font.sf_pro_display_bold, FontWeight.Companion.getBold(), 0, 0, 12, null));
    private static final FontFamily GeneralSans = FontFamilyKt.FontFamily(FontKt.m5185FontYpTlLL0$default(R.font.general_sans_regular, FontWeight.Companion.getNormal(), 0, 0, 12, null), FontKt.m5185FontYpTlLL0$default(R.font.general_sans_bold, FontWeight.Companion.getBold(), 0, 0, 12, null), FontKt.m5185FontYpTlLL0$default(R.font.general_sans_semibold, FontWeight.Companion.getSemiBold(), 0, 0, 12, null));

    private AppFontFamily() {
    }

    public final FontFamily getGhino() {
        return Ghino;
    }

    public final FontFamily getIbmSans() {
        return IbmSans;
    }

    public final FontFamily getSfProDisplay() {
        return SfProDisplay;
    }

    public final FontFamily getGeneralSans() {
        return GeneralSans;
    }
}
