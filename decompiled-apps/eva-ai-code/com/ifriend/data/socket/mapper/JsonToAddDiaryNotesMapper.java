package com.ifriend.data.socket.mapper;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ifriend.common_utils.Logger;
import com.ifriend.data.networking.responses.DiaryNoteDaoModel;
import com.ifriend.data.networking.responses.DiaryNoteDaoModelKt;
import com.ifriend.data.socket.common.SocketMessageKeys;
import com.ifriend.domain.data.Mapper;
import com.ifriend.domain.socket.MessagesSourceMessage;
import com.ifriend.infrastructure.UtilsKt;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
/* compiled from: JsonToAddDiaryNotesMapper.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\n \t*\u0004\u0018\u00010\b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/ifriend/data/socket/mapper/JsonToAddDiaryNotesMapper;", "Lcom/ifriend/domain/data/Mapper;", "Lorg/json/JSONObject;", "Lcom/ifriend/domain/socket/MessagesSourceMessage$AddDiaryNotes;", "logger", "Lcom/ifriend/common_utils/Logger;", "(Lcom/ifriend/common_utils/Logger;)V", "diariesListTypeToken", "Ljava/lang/reflect/Type;", "kotlin.jvm.PlatformType", "gson", "Lcom/google/gson/Gson;", "map", "from", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JsonToAddDiaryNotesMapper implements Mapper<JSONObject, MessagesSourceMessage.AddDiaryNotes> {
    private final Type diariesListTypeToken;
    private final Gson gson;
    private final Logger logger;

    public JsonToAddDiaryNotesMapper(Logger logger) {
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.logger = logger;
        this.gson = new Gson();
        this.diariesListTypeToken = new TypeToken<List<? extends DiaryNoteDaoModel>>() { // from class: com.ifriend.data.socket.mapper.JsonToAddDiaryNotesMapper$diariesListTypeToken$1
        }.getType();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001a, code lost:
        if ((r5 != null ? r5 instanceof org.json.JSONObject : true) != false) goto L6;
     */
    @Override // com.ifriend.domain.data.Mapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public MessagesSourceMessage.AddDiaryNotes map(JSONObject from) {
        Object obj;
        Intrinsics.checkNotNullParameter(from, "from");
        try {
            if (from.has(SocketMessageKeys.DETAILS_KEY)) {
                obj = from.get(SocketMessageKeys.DETAILS_KEY);
            }
            obj = null;
            JSONObject jSONObject = (JSONObject) obj;
            if (jSONObject == null) {
                return (MessagesSourceMessage.AddDiaryNotes) UtilsKt.unexpectedNull();
            }
            String jSONArray = jSONObject.getJSONArray("diaryNotes").toString();
            Intrinsics.checkNotNullExpressionValue(jSONArray, "toString(...)");
            List list = (List) this.gson.fromJson(jSONArray, this.diariesListTypeToken);
            Intrinsics.checkNotNull(list);
            List<DiaryNoteDaoModel> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (DiaryNoteDaoModel diaryNoteDaoModel : list2) {
                arrayList.add(DiaryNoteDaoModelKt.toDomainModel(diaryNoteDaoModel, false));
            }
            return new MessagesSourceMessage.AddDiaryNotes(arrayList);
        } catch (Exception e) {
            this.logger.logException(e);
            return null;
        }
    }
}
