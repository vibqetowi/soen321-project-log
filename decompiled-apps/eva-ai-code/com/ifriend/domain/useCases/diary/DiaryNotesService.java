package com.ifriend.domain.useCases.diary;

import com.ifriend.common_utils.data.Resource;
import com.ifriend.domain.data.BotRepository;
import com.ifriend.domain.data.UserRepository;
import com.ifriend.domain.data.diary.DiaryRepository;
import com.ifriend.domain.models.diary.DiaryMode;
import com.ifriend.domain.models.diary.DiaryNote;
import com.ifriend.domain.models.profile.user.Subscription;
import com.ifriend.domain.toggle.FeatureToggleValue;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import org.apache.http.cookie.ClientCookie;
/* compiled from: DiaryNotesService.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\"\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00110\u00100\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/ifriend/domain/useCases/diary/DiaryNotesService;", "", "repository", "Lcom/ifriend/domain/data/diary/DiaryRepository;", "userRepository", "Lcom/ifriend/domain/data/UserRepository;", "botRepository", "Lcom/ifriend/domain/data/BotRepository;", "diaryFeatureToggle", "Lcom/ifriend/domain/toggle/FeatureToggleValue;", "Lcom/ifriend/domain/models/diary/DiaryMode;", "(Lcom/ifriend/domain/data/diary/DiaryRepository;Lcom/ifriend/domain/data/UserRepository;Lcom/ifriend/domain/data/BotRepository;Lcom/ifriend/domain/toggle/FeatureToggleValue;)V", "lastUserSubscription", "Lcom/ifriend/domain/models/profile/user/Subscription;", "getAllNotes", "Lkotlinx/coroutines/flow/Flow;", "Lcom/ifriend/common_utils/data/Resource;", "", "Lcom/ifriend/domain/models/diary/DiaryNote;", "refresh", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryNotesService {
    private final BotRepository botRepository;
    private final FeatureToggleValue<DiaryMode> diaryFeatureToggle;
    private Subscription lastUserSubscription;
    private final DiaryRepository repository;
    private final UserRepository userRepository;

    public DiaryNotesService(DiaryRepository repository, UserRepository userRepository, BotRepository botRepository, FeatureToggleValue<DiaryMode> diaryFeatureToggle) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        Intrinsics.checkNotNullParameter(botRepository, "botRepository");
        Intrinsics.checkNotNullParameter(diaryFeatureToggle, "diaryFeatureToggle");
        this.repository = repository;
        this.userRepository = userRepository;
        this.botRepository = botRepository;
        this.diaryFeatureToggle = diaryFeatureToggle;
    }

    public static /* synthetic */ Flow getAllNotes$default(DiaryNotesService diaryNotesService, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return diaryNotesService.getAllNotes(z);
    }

    public final Flow<Resource<List<DiaryNote>>> getAllNotes(boolean z) {
        return FlowKt.transformLatest(this.botRepository.getServerActualBot(), new DiaryNotesService$getAllNotes$$inlined$flatMapLatest$1(null, this, z));
    }
}
