package com.ifriend.data.repository.deeplinks;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.ifriend.domain.config.PrimitiveValue;
import com.ifriend.domain.config.PrimitiveValueKt;
import com.ifriend.domain.data.deeplinks.DeepLink;
import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
/* compiled from: DeepLinksParser.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0004H\u0002J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004H\u0002J\u001e\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0002J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\b\u001a\u00020\u0004J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0014\u001a\u00020\u0007H\u0002¨\u0006\u0015"}, d2 = {"Lcom/ifriend/data/repository/deeplinks/DeepLinksParser;", "", "()V", "fetchPathAndQueries", "", "uriString", "getDataDeepLink", "Lcom/ifriend/data/repository/deeplinks/DataDeepLink;", "uri", "isFullUri", "", "mapPathAndQueriesIntoDeepLink", "pathAndQueries", "mapQueries", "", "Lcom/ifriend/domain/config/PrimitiveValue;", "rawQueries", "parse", "Lcom/ifriend/domain/data/deeplinks/DeepLink;", "tryParseOpenDiaryDeepLink", "deepLink", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeepLinksParser {
    public final DeepLink parse(String uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        DataDeepLink dataDeepLink = getDataDeepLink(uri);
        if (dataDeepLink == null) {
            return null;
        }
        return Intrinsics.areEqual(dataDeepLink.getPathSections(), CollectionsKt.listOf("chat")) ? DeepLink.OpenChat.INSTANCE : Intrinsics.areEqual(dataDeepLink.getPathSections(), CollectionsKt.listOf("avatars")) ? DeepLink.OpenGenerateAvatar.INSTANCE : tryParseOpenDiaryDeepLink(dataDeepLink);
    }

    private final DeepLink tryParseOpenDiaryDeepLink(DataDeepLink dataDeepLink) {
        if (Intrinsics.areEqual(CollectionsKt.getOrNull(dataDeepLink.getPathSections(), 0), "ai") && Intrinsics.areEqual(CollectionsKt.getOrNull(dataDeepLink.getPathSections(), 1), "users") && Intrinsics.areEqual(CollectionsKt.getOrNull(dataDeepLink.getPathSections(), 2), "diary-note")) {
            String str = (String) CollectionsKt.getOrNull(dataDeepLink.getPathSections(), 4);
            return str != null ? new DeepLink.OpenDiary(str) : null;
        }
        return null;
    }

    private final DataDeepLink getDataDeepLink(String str) {
        String str2;
        if (!isFullUri(str) || (str2 = fetchPathAndQueries(str)) == null) {
            str2 = str;
        }
        return mapPathAndQueriesIntoDeepLink(str, str2);
    }

    private final DataDeepLink mapPathAndQueriesIntoDeepLink(String str, String str2) {
        List split$default = StringsKt.split$default((CharSequence) str2, new String[]{"?"}, false, 0, 6, (Object) null);
        String str3 = (String) CollectionsKt.getOrNull(split$default, 0);
        if (str3 == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = StringsKt.split$default((CharSequence) str3, new String[]{RemoteSettings.FORWARD_SLASH_STRING}, false, 0, 6, (Object) null).iterator();
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((String) next).length() > 0) {
                    arrayList.add(next);
                }
            } else {
                return new DataDeepLink(str, arrayList, mapQueries((String) CollectionsKt.getOrNull(split$default, 1)));
            }
        }
    }

    private final Map<String, PrimitiveValue> mapQueries(String str) {
        String str2 = str;
        if (str2 == null || str2.length() == 0) {
            return MapsKt.emptyMap();
        }
        List<String> split$default = StringsKt.split$default((CharSequence) str2, new String[]{"&"}, false, 0, 6, (Object) null);
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(split$default, 10)), 16));
        for (String str3 : split$default) {
            List split$default2 = StringsKt.split$default((CharSequence) str3, new String[]{"="}, false, 0, 6, (Object) null);
            Pair pair = TuplesKt.to((String) split$default2.get(0), PrimitiveValueKt.toPrimitiveValue((String) split$default2.get(1)));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    private final boolean isFullUri(String str) {
        try {
            return new URI(str).getHost() != null;
        } catch (Exception unused) {
            return false;
        }
    }

    private final String fetchPathAndQueries(String str) {
        try {
            URI uri = new URI(str);
            StringBuilder sb = new StringBuilder();
            String path = uri.getPath();
            if (path != null) {
                sb.append(path);
            }
            String query = uri.getQuery();
            if (query != null) {
                sb.append("?");
                sb.append(query);
            }
            return sb.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
