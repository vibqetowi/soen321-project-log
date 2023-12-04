package com.ifriend.presentation.common.mappers;

import androidx.autofill.HintConstants;
import com.ifriend.domain.models.profile.Gender;
import com.ifriend.platform.tools.api.ResourceProvider;
import com.ifriend.ui.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: GenderMapper.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ifriend/presentation/common/mappers/GenderMapper;", "", "resourceProvider", "Lcom/ifriend/platform/tools/api/ResourceProvider;", "(Lcom/ifriend/platform/tools/api/ResourceProvider;)V", "map", "", HintConstants.AUTOFILL_HINT_GENDER, "Lcom/ifriend/domain/models/profile/Gender;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class GenderMapper {
    public static final int $stable = 8;
    private final ResourceProvider resourceProvider;

    /* compiled from: GenderMapper.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.MALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Inject
    public GenderMapper(ResourceProvider resourceProvider) {
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.resourceProvider = resourceProvider;
    }

    public final String map(Gender gender) {
        Intrinsics.checkNotNullParameter(gender, "gender");
        int i = WhenMappings.$EnumSwitchMapping$0[gender.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return this.resourceProvider.getString(R.string.common__female);
            }
            return this.resourceProvider.getString(R.string.common__non_binary);
        }
        return this.resourceProvider.getString(R.string.common__male);
    }
}
