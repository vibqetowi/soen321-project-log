package com.ifriend.chat.presentation.ui.menu.botProfile;

import android.content.Context;
import com.ifriend.domain.models.profile.bot.Ethnicity;
import com.ifriend.ui.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: Mapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\t"}, d2 = {"Lcom/ifriend/chat/presentation/ui/menu/botProfile/EthnicityResponseMapper;", "", "()V", "ethnicityResponse", "", "ethnicity", "Lcom/ifriend/domain/models/profile/bot/Ethnicity;", "context", "Landroid/content/Context;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EthnicityResponseMapper {
    public static final int $stable = 0;
    public static final EthnicityResponseMapper INSTANCE = new EthnicityResponseMapper();

    /* compiled from: Mapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Ethnicity.values().length];
            try {
                iArr[Ethnicity.ASIAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Ethnicity.WHITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Ethnicity.LATINO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Ethnicity.BLACK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Ethnicity.OTHER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private EthnicityResponseMapper() {
    }

    public final String ethnicityResponse(Ethnicity ethnicity, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int i = ethnicity == null ? -1 : WhenMappings.$EnumSwitchMapping$0[ethnicity.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return null;
                        }
                        return context.getString(R.string.other);
                    }
                    return context.getString(R.string.black);
                }
                return context.getString(R.string.latino);
            }
            return context.getString(R.string.white);
        }
        return context.getString(R.string.asian);
    }
}
