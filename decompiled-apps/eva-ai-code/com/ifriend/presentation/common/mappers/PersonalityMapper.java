package com.ifriend.presentation.common.mappers;

import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ifriend.domain.models.profile.bot.Personality;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.ui.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: PersonalityMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/presentation/common/mappers/PersonalityMapper;", "", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "map", "", DeviceRequestsHelper.DEVICE_INFO_MODEL, "Lcom/ifriend/domain/models/profile/bot/Personality;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PersonalityMapper {
    public static final int $stable = 8;
    private final ResourceProvider resourceProvider;

    /* compiled from: PersonalityMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Personality.values().length];
            try {
                iArr[Personality.FLIRTY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Personality.FRIENDLY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public PersonalityMapper(ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
    }

    public final String map(Personality model) {
        Intrinsics.checkNotNullParameter(model, "model");
        int i = WhenMappings.$EnumSwitchMapping$0[model.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.resourceProvider.getString(R.string.common__friendly);
            }
            throw new NoWhenBranchMatchedException();
        }
        return this.resourceProvider.getString(R.string.common__flirty);
    }
}
