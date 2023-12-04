package com.ifriend.domain.models.common;

import com.facebook.internal.AnalyticsEvents;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.apache.http.cookie.ClientCookie;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ChatInterestsType.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b%\b\u0086\u0081\u0002\u0018\u0000 %2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001%B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$¨\u0006&"}, d2 = {"Lcom/ifriend/domain/models/common/ChatInterestsType;", "", "(Ljava/lang/String;I)V", "books", "kinks", "tech", "outdoors", "animals", "movies", "traveling", "socialMedia", "videoGames", "fashionBeauty", "comedy", "food", "art", "fantasyWorlds", "sports", "yoga", "science", "astrology", "cars", "fishing", "religion", "music", "languages", "shopping", "partying", "collecting", "crypto", "nft", AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, "dancing", "podcasting", "handcrafting", "psychology", "volunteering", "Companion", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInterestsType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ChatInterestsType[] $VALUES;
    public static final Companion Companion;
    public static final ChatInterestsType books = new ChatInterestsType("books", 0);
    public static final ChatInterestsType kinks = new ChatInterestsType("kinks", 1);
    public static final ChatInterestsType tech = new ChatInterestsType("tech", 2);
    public static final ChatInterestsType outdoors = new ChatInterestsType("outdoors", 3);
    public static final ChatInterestsType animals = new ChatInterestsType("animals", 4);
    public static final ChatInterestsType movies = new ChatInterestsType("movies", 5);
    public static final ChatInterestsType traveling = new ChatInterestsType("traveling", 6);
    public static final ChatInterestsType socialMedia = new ChatInterestsType("socialMedia", 7);
    public static final ChatInterestsType videoGames = new ChatInterestsType("videoGames", 8);
    public static final ChatInterestsType fashionBeauty = new ChatInterestsType("fashionBeauty", 9);
    public static final ChatInterestsType comedy = new ChatInterestsType("comedy", 10);
    public static final ChatInterestsType food = new ChatInterestsType("food", 11);
    public static final ChatInterestsType art = new ChatInterestsType("art", 12);
    public static final ChatInterestsType fantasyWorlds = new ChatInterestsType("fantasyWorlds", 13);
    public static final ChatInterestsType sports = new ChatInterestsType("sports", 14);
    public static final ChatInterestsType yoga = new ChatInterestsType("yoga", 15);
    public static final ChatInterestsType science = new ChatInterestsType("science", 16);
    public static final ChatInterestsType astrology = new ChatInterestsType("astrology", 17);
    public static final ChatInterestsType cars = new ChatInterestsType("cars", 18);
    public static final ChatInterestsType fishing = new ChatInterestsType("fishing", 19);
    public static final ChatInterestsType religion = new ChatInterestsType("religion", 20);
    public static final ChatInterestsType music = new ChatInterestsType("music", 21);
    public static final ChatInterestsType languages = new ChatInterestsType("languages", 22);
    public static final ChatInterestsType shopping = new ChatInterestsType("shopping", 23);
    public static final ChatInterestsType partying = new ChatInterestsType("partying", 24);
    public static final ChatInterestsType collecting = new ChatInterestsType("collecting", 25);
    public static final ChatInterestsType crypto = new ChatInterestsType("crypto", 26);
    public static final ChatInterestsType nft = new ChatInterestsType("nft", 27);
    public static final ChatInterestsType photo = new ChatInterestsType(AnalyticsEvents.PARAMETER_SHARE_DIALOG_CONTENT_PHOTO, 28);
    public static final ChatInterestsType dancing = new ChatInterestsType("dancing", 29);
    public static final ChatInterestsType podcasting = new ChatInterestsType("podcasting", 30);
    public static final ChatInterestsType handcrafting = new ChatInterestsType("handcrafting", 31);
    public static final ChatInterestsType psychology = new ChatInterestsType("psychology", 32);
    public static final ChatInterestsType volunteering = new ChatInterestsType("volunteering", 33);

    private static final /* synthetic */ ChatInterestsType[] $values() {
        return new ChatInterestsType[]{books, kinks, tech, outdoors, animals, movies, traveling, socialMedia, videoGames, fashionBeauty, comedy, food, art, fantasyWorlds, sports, yoga, science, astrology, cars, fishing, religion, music, languages, shopping, partying, collecting, crypto, nft, photo, dancing, podcasting, handcrafting, psychology, volunteering};
    }

    public static EnumEntries<ChatInterestsType> getEntries() {
        return $ENTRIES;
    }

    public static ChatInterestsType valueOf(String str) {
        return (ChatInterestsType) Enum.valueOf(ChatInterestsType.class, str);
    }

    public static ChatInterestsType[] values() {
        return (ChatInterestsType[]) $VALUES.clone();
    }

    private ChatInterestsType(String str, int i) {
    }

    static {
        ChatInterestsType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        Companion = new Companion(null);
    }

    /* compiled from: ChatInterestsType.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/domain/models/common/ChatInterestsType$Companion;", "", "()V", "from", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "interest", "", ClientCookie.DOMAIN_ATTR}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ChatInterestsType from(String interest) {
            Object obj;
            Intrinsics.checkNotNullParameter(interest, "interest");
            Iterator<E> it = ChatInterestsType.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String upperCase = ((ChatInterestsType) obj).name().toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                String upperCase2 = interest.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase2, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                if (Intrinsics.areEqual(upperCase, upperCase2)) {
                    break;
                }
            }
            return (ChatInterestsType) obj;
        }
    }
}
