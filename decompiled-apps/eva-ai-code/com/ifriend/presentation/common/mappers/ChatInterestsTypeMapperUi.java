package com.ifriend.presentation.common.mappers;

import com.ifriend.domain.models.common.ChatInterestsType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
/* compiled from: InterestsMapperUi.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/ifriend/presentation/common/mappers/ChatInterestsTypeMapperUi;", "", "()V", "map", "", "interest", "Lcom/ifriend/domain/models/common/ChatInterestsType;", "presentation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ChatInterestsTypeMapperUi {
    public static final int $stable = 0;

    /* compiled from: InterestsMapperUi.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ChatInterestsType.values().length];
            try {
                iArr[ChatInterestsType.books.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ChatInterestsType.kinks.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ChatInterestsType.tech.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ChatInterestsType.outdoors.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ChatInterestsType.animals.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ChatInterestsType.movies.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ChatInterestsType.traveling.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ChatInterestsType.socialMedia.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ChatInterestsType.videoGames.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[ChatInterestsType.fashionBeauty.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[ChatInterestsType.comedy.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[ChatInterestsType.food.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[ChatInterestsType.art.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[ChatInterestsType.fantasyWorlds.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[ChatInterestsType.sports.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[ChatInterestsType.yoga.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[ChatInterestsType.science.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[ChatInterestsType.astrology.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[ChatInterestsType.cars.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[ChatInterestsType.fishing.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[ChatInterestsType.religion.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[ChatInterestsType.music.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[ChatInterestsType.languages.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[ChatInterestsType.shopping.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[ChatInterestsType.partying.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[ChatInterestsType.collecting.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[ChatInterestsType.crypto.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[ChatInterestsType.nft.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[ChatInterestsType.photo.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[ChatInterestsType.dancing.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[ChatInterestsType.podcasting.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[ChatInterestsType.handcrafting.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[ChatInterestsType.psychology.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[ChatInterestsType.volunteering.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public final String map(ChatInterestsType interest) {
        Intrinsics.checkNotNullParameter(interest, "interest");
        switch (WhenMappings.$EnumSwitchMapping$0[interest.ordinal()]) {
            case 1:
                return "📚 books & writing";
            case 2:
                return "🖤 preference";
            case 3:
                return "💻 tech";
            case 4:
                return "☀️ outdoors";
            case 5:
                return "🐶 animals";
            case 6:
                return "📺 movies & Netflix";
            case 7:
                return "✈️ traveling";
            case 8:
                return "🤳 social media";
            case 9:
                return "🕹 video games";
            case 10:
                return "👗 fashion & beauty";
            case 11:
                return "😜 comedy";
            case 12:
                return "🍎 food & cooking";
            case 13:
                return "🎨 art & design";
            case 14:
                return "🦄 fantasy worlds";
            case 15:
                return "💪 sports";
            case 16:
                return "🧘\u200d♂️ yoga & meditation";
            case 17:
                return "🧠 science";
            case 18:
                return "💫 astrology";
            case 19:
                return "🚗 cars";
            case 20:
                return "🎣 fishing";
            case 21:
                return "⛪️ religion";
            case 22:
                return "🎶 music";
            case 23:
                return "🌍 languages";
            case 24:
                return "🛍️ shopping";
            case 25:
                return "🪩 partying & clubbing";
            case 26:
                return "🗂️ collecting";
            case 27:
                return "💸 crypto";
            case 28:
                return "🕶️ NFT";
            case 29:
                return "📷 photo & videography";
            case 30:
                return "💃 dancing";
            case 31:
                return "🎙️ podcasting";
            case 32:
                return "🙌 handcrafting";
            case 33:
                return "💭 psychology";
            case 34:
                return "🫶 volunteering";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
