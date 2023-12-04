package com.ifriend.data.networking.responses;

import com.ifriend.domain.models.diary.DiaryNote;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
/* compiled from: DiaryNoteDaoModel.kt */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0002\u001a\n\u0010\u0004\u001a\u00020\u0005*\u00020\u0006\u001a\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\b\u0012\u0004\u0012\u00020\u00060\b\u001a\u0012\u0010\t\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\n\u001a\u00020\u000b\u001a\"\u0010\f\u001a\u00020\u0006*\u00020\u00052\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b\u001a4\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\b*\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u000f¨\u0006\u0010"}, d2 = {"replaceStubsWithUserAndBotNames", "", "userName", "botName", "toDaoModel", "Lcom/ifriend/data/networking/responses/DiaryNoteDaoModel;", "Lcom/ifriend/domain/models/diary/DiaryNote;", "toDaoModels", "", "toDomainModel", "isShown", "", "toDomainModelWithReplacingStubs", "toDomainModels", "shonNoteIds", "", "data_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DiaryNoteDaoModelKt {
    public static final DiaryNote toDomainModel(DiaryNoteDaoModel diaryNoteDaoModel, boolean z) {
        Intrinsics.checkNotNullParameter(diaryNoteDaoModel, "<this>");
        String title = diaryNoteDaoModel.getTitle();
        String description = diaryNoteDaoModel.getDescription();
        return new DiaryNote(diaryNoteDaoModel.getId(), title, diaryNoteDaoModel.getDescriptionShort(), description, diaryNoteDaoModel.isAvailable(), diaryNoteDaoModel.isAnswered(), diaryNoteDaoModel.isFree(), diaryNoteDaoModel.getDatetimeInMillis(), z);
    }

    public static final DiaryNote toDomainModelWithReplacingStubs(DiaryNoteDaoModel diaryNoteDaoModel, String userName, String botName, boolean z) {
        Intrinsics.checkNotNullParameter(diaryNoteDaoModel, "<this>");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(botName, "botName");
        String replaceStubsWithUserAndBotNames = replaceStubsWithUserAndBotNames(diaryNoteDaoModel.getTitle(), userName, botName);
        String description = diaryNoteDaoModel.getDescription();
        String replaceStubsWithUserAndBotNames2 = description != null ? replaceStubsWithUserAndBotNames(description, userName, botName) : null;
        String descriptionShort = diaryNoteDaoModel.getDescriptionShort();
        return new DiaryNote(diaryNoteDaoModel.getId(), replaceStubsWithUserAndBotNames, descriptionShort != null ? replaceStubsWithUserAndBotNames(descriptionShort, userName, botName) : null, replaceStubsWithUserAndBotNames2, diaryNoteDaoModel.isAvailable(), diaryNoteDaoModel.isAnswered(), diaryNoteDaoModel.isFree(), diaryNoteDaoModel.getDatetimeInMillis(), z);
    }

    private static final String replaceStubsWithUserAndBotNames(String str, String str2, String str3) {
        return StringsKt.replace$default(StringsKt.replace$default(str, "{UserName}", str2, false, 4, (Object) null), "{BotName}", str3, false, 4, (Object) null);
    }

    public static final List<DiaryNote> toDomainModels(List<DiaryNoteDaoModel> list, String userName, String botName, Set<String> shonNoteIds) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(botName, "botName");
        Intrinsics.checkNotNullParameter(shonNoteIds, "shonNoteIds");
        List<DiaryNoteDaoModel> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (DiaryNoteDaoModel diaryNoteDaoModel : list2) {
            arrayList.add(toDomainModelWithReplacingStubs(diaryNoteDaoModel, userName, botName, shonNoteIds.contains(diaryNoteDaoModel.getId())));
        }
        return arrayList;
    }

    public static final List<DiaryNoteDaoModel> toDaoModels(List<DiaryNote> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        List<DiaryNote> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (DiaryNote diaryNote : list2) {
            arrayList.add(toDaoModel(diaryNote));
        }
        return arrayList;
    }

    public static final DiaryNoteDaoModel toDaoModel(DiaryNote diaryNote) {
        Intrinsics.checkNotNullParameter(diaryNote, "<this>");
        return new DiaryNoteDaoModel(diaryNote.getId(), diaryNote.getTitle(), diaryNote.getDescriptionShort(), diaryNote.getDescription(), diaryNote.isAvailable(), diaryNote.isAnswered(), diaryNote.isFree(), diaryNote.getTimestamp());
    }
}
