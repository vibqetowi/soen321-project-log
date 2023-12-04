package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* compiled from: TonalPalette.kt */
@Metadata(d1 = {"\u0000\u0013\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0003\b\u0085\u0001\b\u0000\u0018\u00002\u00020\u0001B\u0090\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\u0003\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\u0006\u0010\u001d\u001a\u00020\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0003\u0012\u0006\u0010\u001f\u001a\u00020\u0003\u0012\u0006\u0010 \u001a\u00020\u0003\u0012\u0006\u0010!\u001a\u00020\u0003\u0012\u0006\u0010\"\u001a\u00020\u0003\u0012\u0006\u0010#\u001a\u00020\u0003\u0012\u0006\u0010$\u001a\u00020\u0003\u0012\u0006\u0010%\u001a\u00020\u0003\u0012\u0006\u0010&\u001a\u00020\u0003\u0012\u0006\u0010'\u001a\u00020\u0003\u0012\u0006\u0010(\u001a\u00020\u0003\u0012\u0006\u0010)\u001a\u00020\u0003\u0012\u0006\u0010*\u001a\u00020\u0003\u0012\u0006\u0010+\u001a\u00020\u0003\u0012\u0006\u0010,\u001a\u00020\u0003\u0012\u0006\u0010-\u001a\u00020\u0003\u0012\u0006\u0010.\u001a\u00020\u0003\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00100\u001a\u00020\u0003\u0012\u0006\u00101\u001a\u00020\u0003\u0012\u0006\u00102\u001a\u00020\u0003\u0012\u0006\u00103\u001a\u00020\u0003\u0012\u0006\u00104\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u00020\u0003\u0012\u0006\u00106\u001a\u00020\u0003\u0012\u0006\u00107\u001a\u00020\u0003\u0012\u0006\u00108\u001a\u00020\u0003\u0012\u0006\u00109\u001a\u00020\u0003\u0012\u0006\u0010:\u001a\u00020\u0003\u0012\u0006\u0010;\u001a\u00020\u0003\u0012\u0006\u0010<\u001a\u00020\u0003\u0012\u0006\u0010=\u001a\u00020\u0003\u0012\u0006\u0010>\u001a\u00020\u0003\u0012\u0006\u0010?\u001a\u00020\u0003\u0012\u0006\u0010@\u001a\u00020\u0003\u0012\u0006\u0010A\u001a\u00020\u0003\u0012\u0006\u0010B\u001a\u00020\u0003\u0012\u0006\u0010C\u001a\u00020\u0003ø\u0001\u0000¢\u0006\u0002\u0010DR\u001c\u0010\u000f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bE\u0010FR\u001c\u0010\u000e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bH\u0010FR\u001c\u0010\u0002\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bI\u0010FR\u001c\u0010\r\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bJ\u0010FR\u001c\u0010\f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bK\u0010FR\u001c\u0010\u000b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bL\u0010FR\u001c\u0010\n\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bM\u0010FR\u001c\u0010\t\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bN\u0010FR\u001c\u0010\b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bO\u0010FR\u001c\u0010\u0007\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bP\u0010FR\u001c\u0010\u0006\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bQ\u0010FR\u001c\u0010\u0005\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bR\u0010FR\u001c\u0010\u0004\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bS\u0010FR\u001c\u0010\u001c\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bT\u0010FR\u001c\u0010\u001b\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bU\u0010FR\u001c\u0010\u0010\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bV\u0010FR\u001c\u0010\u001a\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bW\u0010FR\u001c\u0010\u0019\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bX\u0010FR\u001c\u0010\u0018\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bY\u0010FR\u001c\u0010\u0017\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bZ\u0010FR\u001c\u0010\u0016\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b[\u0010FR\u001c\u0010\u0015\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b\\\u0010FR\u001c\u0010\u0014\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b]\u0010FR\u001c\u0010\u0013\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b^\u0010FR\u001c\u0010\u0012\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b_\u0010FR\u001c\u0010\u0011\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b`\u0010FR\u001c\u0010)\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\ba\u0010FR\u001c\u0010(\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bb\u0010FR\u001c\u0010\u001d\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bc\u0010FR\u001c\u0010'\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bd\u0010FR\u001c\u0010&\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\be\u0010FR\u001c\u0010%\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bf\u0010FR\u001c\u0010$\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bg\u0010FR\u001c\u0010#\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bh\u0010FR\u001c\u0010\"\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bi\u0010FR\u001c\u0010!\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bj\u0010FR\u001c\u0010 \u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bk\u0010FR\u001c\u0010\u001f\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bl\u0010FR\u001c\u0010\u001e\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bm\u0010FR\u001c\u00106\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bn\u0010FR\u001c\u00105\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bo\u0010FR\u001c\u0010*\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bp\u0010FR\u001c\u00104\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bq\u0010FR\u001c\u00103\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\br\u0010FR\u001c\u00102\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bs\u0010FR\u001c\u00101\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bt\u0010FR\u001c\u00100\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bu\u0010FR\u001c\u0010/\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bv\u0010FR\u001c\u0010.\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bw\u0010FR\u001c\u0010-\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bx\u0010FR\u001c\u0010,\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\by\u0010FR\u001c\u0010+\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\bz\u0010FR\u001c\u0010C\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b{\u0010FR\u001c\u0010B\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b|\u0010FR\u001c\u00107\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b}\u0010FR\u001c\u0010A\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b~\u0010FR\u001c\u0010@\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\n\n\u0002\u0010G\u001a\u0004\b\u007f\u0010FR\u001d\u0010?\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0080\u0001\u0010FR\u001d\u0010>\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0081\u0001\u0010FR\u001d\u0010=\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0082\u0001\u0010FR\u001d\u0010<\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0083\u0001\u0010FR\u001d\u0010;\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0084\u0001\u0010FR\u001d\u0010:\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0085\u0001\u0010FR\u001d\u00109\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0086\u0001\u0010FR\u001d\u00108\u001a\u00020\u0003ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u000b\n\u0002\u0010G\u001a\u0005\b\u0087\u0001\u0010F\u0082\u0002\u000f\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/material3/TonalPalette;", "", "neutral100", "Landroidx/compose/ui/graphics/Color;", "neutral99", "neutral95", "neutral90", "neutral80", "neutral70", "neutral60", "neutral50", "neutral40", "neutral30", "neutral20", "neutral10", "neutral0", "neutralVariant100", "neutralVariant99", "neutralVariant95", "neutralVariant90", "neutralVariant80", "neutralVariant70", "neutralVariant60", "neutralVariant50", "neutralVariant40", "neutralVariant30", "neutralVariant20", "neutralVariant10", "neutralVariant0", "primary100", "primary99", "primary95", "primary90", "primary80", "primary70", "primary60", "primary50", "primary40", "primary30", "primary20", "primary10", "primary0", "secondary100", "secondary99", "secondary95", "secondary90", "secondary80", "secondary70", "secondary60", "secondary50", "secondary40", "secondary30", "secondary20", "secondary10", "secondary0", "tertiary100", "tertiary99", "tertiary95", "tertiary90", "tertiary80", "tertiary70", "tertiary60", "tertiary50", "tertiary40", "tertiary30", "tertiary20", "tertiary10", "tertiary0", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "getNeutral0-0d7_KjU", "()J", "J", "getNeutral10-0d7_KjU", "getNeutral100-0d7_KjU", "getNeutral20-0d7_KjU", "getNeutral30-0d7_KjU", "getNeutral40-0d7_KjU", "getNeutral50-0d7_KjU", "getNeutral60-0d7_KjU", "getNeutral70-0d7_KjU", "getNeutral80-0d7_KjU", "getNeutral90-0d7_KjU", "getNeutral95-0d7_KjU", "getNeutral99-0d7_KjU", "getNeutralVariant0-0d7_KjU", "getNeutralVariant10-0d7_KjU", "getNeutralVariant100-0d7_KjU", "getNeutralVariant20-0d7_KjU", "getNeutralVariant30-0d7_KjU", "getNeutralVariant40-0d7_KjU", "getNeutralVariant50-0d7_KjU", "getNeutralVariant60-0d7_KjU", "getNeutralVariant70-0d7_KjU", "getNeutralVariant80-0d7_KjU", "getNeutralVariant90-0d7_KjU", "getNeutralVariant95-0d7_KjU", "getNeutralVariant99-0d7_KjU", "getPrimary0-0d7_KjU", "getPrimary10-0d7_KjU", "getPrimary100-0d7_KjU", "getPrimary20-0d7_KjU", "getPrimary30-0d7_KjU", "getPrimary40-0d7_KjU", "getPrimary50-0d7_KjU", "getPrimary60-0d7_KjU", "getPrimary70-0d7_KjU", "getPrimary80-0d7_KjU", "getPrimary90-0d7_KjU", "getPrimary95-0d7_KjU", "getPrimary99-0d7_KjU", "getSecondary0-0d7_KjU", "getSecondary10-0d7_KjU", "getSecondary100-0d7_KjU", "getSecondary20-0d7_KjU", "getSecondary30-0d7_KjU", "getSecondary40-0d7_KjU", "getSecondary50-0d7_KjU", "getSecondary60-0d7_KjU", "getSecondary70-0d7_KjU", "getSecondary80-0d7_KjU", "getSecondary90-0d7_KjU", "getSecondary95-0d7_KjU", "getSecondary99-0d7_KjU", "getTertiary0-0d7_KjU", "getTertiary10-0d7_KjU", "getTertiary100-0d7_KjU", "getTertiary20-0d7_KjU", "getTertiary30-0d7_KjU", "getTertiary40-0d7_KjU", "getTertiary50-0d7_KjU", "getTertiary60-0d7_KjU", "getTertiary70-0d7_KjU", "getTertiary80-0d7_KjU", "getTertiary90-0d7_KjU", "getTertiary95-0d7_KjU", "getTertiary99-0d7_KjU", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TonalPalette {
    private final long neutral0;
    private final long neutral10;
    private final long neutral100;
    private final long neutral20;
    private final long neutral30;
    private final long neutral40;
    private final long neutral50;
    private final long neutral60;
    private final long neutral70;
    private final long neutral80;
    private final long neutral90;
    private final long neutral95;
    private final long neutral99;
    private final long neutralVariant0;
    private final long neutralVariant10;
    private final long neutralVariant100;
    private final long neutralVariant20;
    private final long neutralVariant30;
    private final long neutralVariant40;
    private final long neutralVariant50;
    private final long neutralVariant60;
    private final long neutralVariant70;
    private final long neutralVariant80;
    private final long neutralVariant90;
    private final long neutralVariant95;
    private final long neutralVariant99;
    private final long primary0;
    private final long primary10;
    private final long primary100;
    private final long primary20;
    private final long primary30;
    private final long primary40;
    private final long primary50;
    private final long primary60;
    private final long primary70;
    private final long primary80;
    private final long primary90;
    private final long primary95;
    private final long primary99;
    private final long secondary0;
    private final long secondary10;
    private final long secondary100;
    private final long secondary20;
    private final long secondary30;
    private final long secondary40;
    private final long secondary50;
    private final long secondary60;
    private final long secondary70;
    private final long secondary80;
    private final long secondary90;
    private final long secondary95;
    private final long secondary99;
    private final long tertiary0;
    private final long tertiary10;
    private final long tertiary100;
    private final long tertiary20;
    private final long tertiary30;
    private final long tertiary40;
    private final long tertiary50;
    private final long tertiary60;
    private final long tertiary70;
    private final long tertiary80;
    private final long tertiary90;
    private final long tertiary95;
    private final long tertiary99;

    public /* synthetic */ TonalPalette(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3, j4, j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, j31, j32, j33, j34, j35, j36, j37, j38, j39, j40, j41, j42, j43, j44, j45, j46, j47, j48, j49, j50, j51, j52, j53, j54, j55, j56, j57, j58, j59, j60, j61, j62, j63, j64, j65);
    }

    private TonalPalette(long j, long j2, long j3, long j4, long j5, long j6, long j7, long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, long j30, long j31, long j32, long j33, long j34, long j35, long j36, long j37, long j38, long j39, long j40, long j41, long j42, long j43, long j44, long j45, long j46, long j47, long j48, long j49, long j50, long j51, long j52, long j53, long j54, long j55, long j56, long j57, long j58, long j59, long j60, long j61, long j62, long j63, long j64, long j65) {
        this.neutral100 = j;
        this.neutral99 = j2;
        this.neutral95 = j3;
        this.neutral90 = j4;
        this.neutral80 = j5;
        this.neutral70 = j6;
        this.neutral60 = j7;
        this.neutral50 = j8;
        this.neutral40 = j9;
        this.neutral30 = j10;
        this.neutral20 = j11;
        this.neutral10 = j12;
        this.neutral0 = j13;
        this.neutralVariant100 = j14;
        this.neutralVariant99 = j15;
        this.neutralVariant95 = j16;
        this.neutralVariant90 = j17;
        this.neutralVariant80 = j18;
        this.neutralVariant70 = j19;
        this.neutralVariant60 = j20;
        this.neutralVariant50 = j21;
        this.neutralVariant40 = j22;
        this.neutralVariant30 = j23;
        this.neutralVariant20 = j24;
        this.neutralVariant10 = j25;
        this.neutralVariant0 = j26;
        this.primary100 = j27;
        this.primary99 = j28;
        this.primary95 = j29;
        this.primary90 = j30;
        this.primary80 = j31;
        this.primary70 = j32;
        this.primary60 = j33;
        this.primary50 = j34;
        this.primary40 = j35;
        this.primary30 = j36;
        this.primary20 = j37;
        this.primary10 = j38;
        this.primary0 = j39;
        this.secondary100 = j40;
        this.secondary99 = j41;
        this.secondary95 = j42;
        this.secondary90 = j43;
        this.secondary80 = j44;
        this.secondary70 = j45;
        this.secondary60 = j46;
        this.secondary50 = j47;
        this.secondary40 = j48;
        this.secondary30 = j49;
        this.secondary20 = j50;
        this.secondary10 = j51;
        this.secondary0 = j52;
        this.tertiary100 = j53;
        this.tertiary99 = j54;
        this.tertiary95 = j55;
        this.tertiary90 = j56;
        this.tertiary80 = j57;
        this.tertiary70 = j58;
        this.tertiary60 = j59;
        this.tertiary50 = j60;
        this.tertiary40 = j61;
        this.tertiary30 = j62;
        this.tertiary20 = j63;
        this.tertiary10 = j64;
        this.tertiary0 = j65;
    }

    /* renamed from: getNeutral100-0d7_KjU  reason: not valid java name */
    public final long m2192getNeutral1000d7_KjU() {
        return this.neutral100;
    }

    /* renamed from: getNeutral99-0d7_KjU  reason: not valid java name */
    public final long m2202getNeutral990d7_KjU() {
        return this.neutral99;
    }

    /* renamed from: getNeutral95-0d7_KjU  reason: not valid java name */
    public final long m2201getNeutral950d7_KjU() {
        return this.neutral95;
    }

    /* renamed from: getNeutral90-0d7_KjU  reason: not valid java name */
    public final long m2200getNeutral900d7_KjU() {
        return this.neutral90;
    }

    /* renamed from: getNeutral80-0d7_KjU  reason: not valid java name */
    public final long m2199getNeutral800d7_KjU() {
        return this.neutral80;
    }

    /* renamed from: getNeutral70-0d7_KjU  reason: not valid java name */
    public final long m2198getNeutral700d7_KjU() {
        return this.neutral70;
    }

    /* renamed from: getNeutral60-0d7_KjU  reason: not valid java name */
    public final long m2197getNeutral600d7_KjU() {
        return this.neutral60;
    }

    /* renamed from: getNeutral50-0d7_KjU  reason: not valid java name */
    public final long m2196getNeutral500d7_KjU() {
        return this.neutral50;
    }

    /* renamed from: getNeutral40-0d7_KjU  reason: not valid java name */
    public final long m2195getNeutral400d7_KjU() {
        return this.neutral40;
    }

    /* renamed from: getNeutral30-0d7_KjU  reason: not valid java name */
    public final long m2194getNeutral300d7_KjU() {
        return this.neutral30;
    }

    /* renamed from: getNeutral20-0d7_KjU  reason: not valid java name */
    public final long m2193getNeutral200d7_KjU() {
        return this.neutral20;
    }

    /* renamed from: getNeutral10-0d7_KjU  reason: not valid java name */
    public final long m2191getNeutral100d7_KjU() {
        return this.neutral10;
    }

    /* renamed from: getNeutral0-0d7_KjU  reason: not valid java name */
    public final long m2190getNeutral00d7_KjU() {
        return this.neutral0;
    }

    /* renamed from: getNeutralVariant100-0d7_KjU  reason: not valid java name */
    public final long m2205getNeutralVariant1000d7_KjU() {
        return this.neutralVariant100;
    }

    /* renamed from: getNeutralVariant99-0d7_KjU  reason: not valid java name */
    public final long m2215getNeutralVariant990d7_KjU() {
        return this.neutralVariant99;
    }

    /* renamed from: getNeutralVariant95-0d7_KjU  reason: not valid java name */
    public final long m2214getNeutralVariant950d7_KjU() {
        return this.neutralVariant95;
    }

    /* renamed from: getNeutralVariant90-0d7_KjU  reason: not valid java name */
    public final long m2213getNeutralVariant900d7_KjU() {
        return this.neutralVariant90;
    }

    /* renamed from: getNeutralVariant80-0d7_KjU  reason: not valid java name */
    public final long m2212getNeutralVariant800d7_KjU() {
        return this.neutralVariant80;
    }

    /* renamed from: getNeutralVariant70-0d7_KjU  reason: not valid java name */
    public final long m2211getNeutralVariant700d7_KjU() {
        return this.neutralVariant70;
    }

    /* renamed from: getNeutralVariant60-0d7_KjU  reason: not valid java name */
    public final long m2210getNeutralVariant600d7_KjU() {
        return this.neutralVariant60;
    }

    /* renamed from: getNeutralVariant50-0d7_KjU  reason: not valid java name */
    public final long m2209getNeutralVariant500d7_KjU() {
        return this.neutralVariant50;
    }

    /* renamed from: getNeutralVariant40-0d7_KjU  reason: not valid java name */
    public final long m2208getNeutralVariant400d7_KjU() {
        return this.neutralVariant40;
    }

    /* renamed from: getNeutralVariant30-0d7_KjU  reason: not valid java name */
    public final long m2207getNeutralVariant300d7_KjU() {
        return this.neutralVariant30;
    }

    /* renamed from: getNeutralVariant20-0d7_KjU  reason: not valid java name */
    public final long m2206getNeutralVariant200d7_KjU() {
        return this.neutralVariant20;
    }

    /* renamed from: getNeutralVariant10-0d7_KjU  reason: not valid java name */
    public final long m2204getNeutralVariant100d7_KjU() {
        return this.neutralVariant10;
    }

    /* renamed from: getNeutralVariant0-0d7_KjU  reason: not valid java name */
    public final long m2203getNeutralVariant00d7_KjU() {
        return this.neutralVariant0;
    }

    /* renamed from: getPrimary100-0d7_KjU  reason: not valid java name */
    public final long m2218getPrimary1000d7_KjU() {
        return this.primary100;
    }

    /* renamed from: getPrimary99-0d7_KjU  reason: not valid java name */
    public final long m2228getPrimary990d7_KjU() {
        return this.primary99;
    }

    /* renamed from: getPrimary95-0d7_KjU  reason: not valid java name */
    public final long m2227getPrimary950d7_KjU() {
        return this.primary95;
    }

    /* renamed from: getPrimary90-0d7_KjU  reason: not valid java name */
    public final long m2226getPrimary900d7_KjU() {
        return this.primary90;
    }

    /* renamed from: getPrimary80-0d7_KjU  reason: not valid java name */
    public final long m2225getPrimary800d7_KjU() {
        return this.primary80;
    }

    /* renamed from: getPrimary70-0d7_KjU  reason: not valid java name */
    public final long m2224getPrimary700d7_KjU() {
        return this.primary70;
    }

    /* renamed from: getPrimary60-0d7_KjU  reason: not valid java name */
    public final long m2223getPrimary600d7_KjU() {
        return this.primary60;
    }

    /* renamed from: getPrimary50-0d7_KjU  reason: not valid java name */
    public final long m2222getPrimary500d7_KjU() {
        return this.primary50;
    }

    /* renamed from: getPrimary40-0d7_KjU  reason: not valid java name */
    public final long m2221getPrimary400d7_KjU() {
        return this.primary40;
    }

    /* renamed from: getPrimary30-0d7_KjU  reason: not valid java name */
    public final long m2220getPrimary300d7_KjU() {
        return this.primary30;
    }

    /* renamed from: getPrimary20-0d7_KjU  reason: not valid java name */
    public final long m2219getPrimary200d7_KjU() {
        return this.primary20;
    }

    /* renamed from: getPrimary10-0d7_KjU  reason: not valid java name */
    public final long m2217getPrimary100d7_KjU() {
        return this.primary10;
    }

    /* renamed from: getPrimary0-0d7_KjU  reason: not valid java name */
    public final long m2216getPrimary00d7_KjU() {
        return this.primary0;
    }

    /* renamed from: getSecondary100-0d7_KjU  reason: not valid java name */
    public final long m2231getSecondary1000d7_KjU() {
        return this.secondary100;
    }

    /* renamed from: getSecondary99-0d7_KjU  reason: not valid java name */
    public final long m2241getSecondary990d7_KjU() {
        return this.secondary99;
    }

    /* renamed from: getSecondary95-0d7_KjU  reason: not valid java name */
    public final long m2240getSecondary950d7_KjU() {
        return this.secondary95;
    }

    /* renamed from: getSecondary90-0d7_KjU  reason: not valid java name */
    public final long m2239getSecondary900d7_KjU() {
        return this.secondary90;
    }

    /* renamed from: getSecondary80-0d7_KjU  reason: not valid java name */
    public final long m2238getSecondary800d7_KjU() {
        return this.secondary80;
    }

    /* renamed from: getSecondary70-0d7_KjU  reason: not valid java name */
    public final long m2237getSecondary700d7_KjU() {
        return this.secondary70;
    }

    /* renamed from: getSecondary60-0d7_KjU  reason: not valid java name */
    public final long m2236getSecondary600d7_KjU() {
        return this.secondary60;
    }

    /* renamed from: getSecondary50-0d7_KjU  reason: not valid java name */
    public final long m2235getSecondary500d7_KjU() {
        return this.secondary50;
    }

    /* renamed from: getSecondary40-0d7_KjU  reason: not valid java name */
    public final long m2234getSecondary400d7_KjU() {
        return this.secondary40;
    }

    /* renamed from: getSecondary30-0d7_KjU  reason: not valid java name */
    public final long m2233getSecondary300d7_KjU() {
        return this.secondary30;
    }

    /* renamed from: getSecondary20-0d7_KjU  reason: not valid java name */
    public final long m2232getSecondary200d7_KjU() {
        return this.secondary20;
    }

    /* renamed from: getSecondary10-0d7_KjU  reason: not valid java name */
    public final long m2230getSecondary100d7_KjU() {
        return this.secondary10;
    }

    /* renamed from: getSecondary0-0d7_KjU  reason: not valid java name */
    public final long m2229getSecondary00d7_KjU() {
        return this.secondary0;
    }

    /* renamed from: getTertiary100-0d7_KjU  reason: not valid java name */
    public final long m2244getTertiary1000d7_KjU() {
        return this.tertiary100;
    }

    /* renamed from: getTertiary99-0d7_KjU  reason: not valid java name */
    public final long m2254getTertiary990d7_KjU() {
        return this.tertiary99;
    }

    /* renamed from: getTertiary95-0d7_KjU  reason: not valid java name */
    public final long m2253getTertiary950d7_KjU() {
        return this.tertiary95;
    }

    /* renamed from: getTertiary90-0d7_KjU  reason: not valid java name */
    public final long m2252getTertiary900d7_KjU() {
        return this.tertiary90;
    }

    /* renamed from: getTertiary80-0d7_KjU  reason: not valid java name */
    public final long m2251getTertiary800d7_KjU() {
        return this.tertiary80;
    }

    /* renamed from: getTertiary70-0d7_KjU  reason: not valid java name */
    public final long m2250getTertiary700d7_KjU() {
        return this.tertiary70;
    }

    /* renamed from: getTertiary60-0d7_KjU  reason: not valid java name */
    public final long m2249getTertiary600d7_KjU() {
        return this.tertiary60;
    }

    /* renamed from: getTertiary50-0d7_KjU  reason: not valid java name */
    public final long m2248getTertiary500d7_KjU() {
        return this.tertiary50;
    }

    /* renamed from: getTertiary40-0d7_KjU  reason: not valid java name */
    public final long m2247getTertiary400d7_KjU() {
        return this.tertiary40;
    }

    /* renamed from: getTertiary30-0d7_KjU  reason: not valid java name */
    public final long m2246getTertiary300d7_KjU() {
        return this.tertiary30;
    }

    /* renamed from: getTertiary20-0d7_KjU  reason: not valid java name */
    public final long m2245getTertiary200d7_KjU() {
        return this.tertiary20;
    }

    /* renamed from: getTertiary10-0d7_KjU  reason: not valid java name */
    public final long m2243getTertiary100d7_KjU() {
        return this.tertiary10;
    }

    /* renamed from: getTertiary0-0d7_KjU  reason: not valid java name */
    public final long m2242getTertiary00d7_KjU() {
        return this.tertiary0;
    }
}
