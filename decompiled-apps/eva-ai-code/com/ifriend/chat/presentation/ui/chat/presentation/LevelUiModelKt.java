package com.ifriend.chat.presentation.ui.chat.presentation;

import com.ifriend.chat.presentation.ui.chat.presentation.LevelUiModel;
import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.models.levels.LevelInfo;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: LevelUiModel.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002¨\u0006\u0004"}, d2 = {"toUiModel", "Lcom/ifriend/chat/presentation/ui/chat/presentation/LevelUiModel;", "Lcom/ifriend/common_utils/data/Resource;", "Lcom/ifriend/domain/models/levels/LevelInfo;", "presentation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LevelUiModelKt {
    public static final LevelUiModel toUiModel(Resource<LevelInfo> resource) {
        Intrinsics.checkNotNullParameter(resource, "<this>");
        if (resource instanceof Resource.Error) {
            return LevelUiModel.DoesNotShow.INSTANCE;
        }
        if (resource instanceof Resource.Loading) {
            LevelInfo data = resource.getData();
            if (data == null) {
                return LevelUiModel.NotLoaded.INSTANCE;
            }
            return new LevelUiModel.Show(data.getLevel(), data.getCurrentPoints(), data.getNextLevelPoints());
        } else if (resource instanceof Resource.Success) {
            LevelInfo data2 = resource.getData();
            int level = data2 != null ? data2.getLevel() : 0;
            LevelInfo data3 = resource.getData();
            int currentPoints = data3 != null ? data3.getCurrentPoints() : 0;
            LevelInfo data4 = resource.getData();
            return new LevelUiModel.Show(level, currentPoints, data4 != null ? data4.getNextLevelPoints() : 0);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }
}
