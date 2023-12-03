package com.theinnerhour.b2b.network.model;

import androidx.recyclerview.widget.LinearLayoutManager;
import com.appsflyer.R;
import com.theinnerhour.b2b.model.TypeOfPackageModel;
import com.theinnerhour.b2b.utils.Constants;
import com.theinnerhour.b2b.utils.SessionManager;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.d;
import kotlin.jvm.internal.i;
import pl.a;
import tf.b;
/* compiled from: UpcomingSessionsModel.kt */
@Metadata(d1 = {"\u0000O\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0003\b¡\u0001\b\u0086\b\u0018\u00002\u00020\u0001Bï\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\b\u0012\u0006\u0010\u0019\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u0011\u0012\u0006\u0010\u001e\u001a\u00020\b\u0012\u0006\u0010\u001f\u001a\u00020\u000f\u0012\u0006\u0010 \u001a\u00020\b\u0012\u0006\u0010!\u001a\u00020\b\u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\b\u0012\u0006\u0010$\u001a\u00020\u0011\u0012\u0006\u0010%\u001a\u00020\b\u0012\u0006\u0010&\u001a\u00020\u0005\u0012\u0006\u0010'\u001a\u00020\u0005\u0012\u0006\u0010(\u001a\u00020\u0005\u0012\u0006\u0010)\u001a\u00020\u0005\u0012\u0006\u0010*\u001a\u00020\u0005\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020\u000f\u0012\u0006\u0010.\u001a\u00020\b\u0012\u0006\u0010/\u001a\u00020\u001c\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u00101\u001a\u00020\u000f\u0012\u0006\u00102\u001a\u00020\u0005\u0012\u0006\u00103\u001a\u00020\u0005\u0012\u0006\u00104\u001a\u00020\u000f\u0012\b\u00105\u001a\u0004\u0018\u000106¢\u0006\u0002\u00107J\n\u0010¥\u0001\u001a\u00020\u0003HÆ\u0003J\n\u0010¦\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010§\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¨\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010©\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010ª\u0001\u001a\u00020\bHÆ\u0003J\n\u0010«\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¬\u0001\u001a\u00020\bHÆ\u0003J\n\u0010\u00ad\u0001\u001a\u00020\bHÆ\u0003J\n\u0010®\u0001\u001a\u00020\u000fHÆ\u0003J\u0011\u0010¯\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010qJ\n\u0010°\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010±\u0001\u001a\u00020\u001cHÆ\u0003J\n\u0010²\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010³\u0001\u001a\u00020\bHÆ\u0003J\n\u0010´\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010µ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¶\u0001\u001a\u00020\bHÆ\u0003J\n\u0010·\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¸\u0001\u001a\u00020\bHÆ\u0003J\n\u0010¹\u0001\u001a\u00020\u0011HÆ\u0003J\n\u0010º\u0001\u001a\u00020\bHÆ\u0003J\n\u0010»\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¼\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010½\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¾\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010¿\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010À\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Á\u0001\u001a\u00020,HÆ\u0003J\n\u0010Â\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010Ã\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ä\u0001\u001a\u00020\u001cHÆ\u0003J\u0011\u0010Å\u0001\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010qJ\n\u0010Æ\u0001\u001a\u00020\bHÆ\u0003J\n\u0010Ç\u0001\u001a\u00020\u000fHÆ\u0003J\n\u0010È\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010É\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Ê\u0001\u001a\u00020\u000fHÆ\u0003J\f\u0010Ë\u0001\u001a\u0004\u0018\u000106HÆ\u0003J\n\u0010Ì\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Í\u0001\u001a\u00020\u0005HÆ\u0003J\n\u0010Î\u0001\u001a\u00020\fHÆ\u0003J\n\u0010Ï\u0001\u001a\u00020\fHÆ\u0003J\n\u0010Ð\u0001\u001a\u00020\u000fHÆ\u0003JÎ\u0003\u0010Ñ\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u000f2\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\b2\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\b2\b\b\u0002\u0010\u0019\u001a\u00020\u000f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u00112\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\u000f2\b\b\u0002\u0010 \u001a\u00020\b2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\"\u001a\u00020\b2\b\b\u0002\u0010#\u001a\u00020\b2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\b2\b\b\u0002\u0010&\u001a\u00020\u00052\b\b\u0002\u0010'\u001a\u00020\u00052\b\b\u0002\u0010(\u001a\u00020\u00052\b\b\u0002\u0010)\u001a\u00020\u00052\b\b\u0002\u0010*\u001a\u00020\u00052\b\b\u0002\u0010+\u001a\u00020,2\b\b\u0002\u0010-\u001a\u00020\u000f2\b\b\u0002\u0010.\u001a\u00020\b2\b\b\u0002\u0010/\u001a\u00020\u001c2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u00101\u001a\u00020\u000f2\b\b\u0002\u00102\u001a\u00020\u00052\b\b\u0002\u00103\u001a\u00020\u00052\b\b\u0002\u00104\u001a\u00020\u000f2\n\b\u0002\u00105\u001a\u0004\u0018\u000106HÆ\u0001¢\u0006\u0003\u0010Ò\u0001J\u0015\u0010Ó\u0001\u001a\u00020\u00032\t\u0010Ô\u0001\u001a\u0004\u0018\u00010\bHÖ\u0003J\n\u0010Õ\u0001\u001a\u00020\u000fHÖ\u0001J\n\u0010Ö\u0001\u001a\u00020\u0005HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010=\"\u0004\bA\u0010?R\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER \u00105\u001a\u0004\u0018\u0001068\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010=\"\u0004\bK\u0010?R\u001e\u0010\n\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010=\"\u0004\bM\u0010?R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001e\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010O\"\u0004\bS\u0010QR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010Y\"\u0004\bZ\u0010[R\u001e\u0010\u0012\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010=\"\u0004\b]\u0010?R\u001e\u0010\u0013\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010U\"\u0004\b_\u0010WR\u001e\u0010\u0014\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010=\"\u0004\ba\u0010?R\u001e\u0010\u0015\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bb\u0010C\"\u0004\bc\u0010ER\u001e\u0010\u0016\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bd\u0010C\"\u0004\be\u0010ER\u001e\u0010\u0017\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bf\u0010C\"\u0004\bg\u0010ER\u001e\u0010\u0018\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010C\"\u0004\bi\u0010ER\u001e\u0010\u0019\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bj\u0010U\"\u0004\bk\u0010WR\u001e\u0010\u001b\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\"\u0010\u001a\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010t\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u001e\u0010\u001d\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bu\u0010Y\"\u0004\bv\u0010[R\u001e\u0010\u001e\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bw\u0010C\"\u0004\bx\u0010ER\u001e\u0010\u001f\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\by\u0010U\"\u0004\bz\u0010WR\u001e\u0010 \u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b{\u0010C\"\u0004\b|\u0010ER\u001e\u0010!\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b}\u0010C\"\u0004\b~\u0010ER\u001f\u0010\"\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010C\"\u0005\b\u0080\u0001\u0010ER \u0010#\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0081\u0001\u0010C\"\u0005\b\u0082\u0001\u0010ER \u0010$\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0083\u0001\u0010Y\"\u0005\b\u0084\u0001\u0010[R \u0010%\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010C\"\u0005\b\u0086\u0001\u0010ER \u0010&\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0087\u0001\u0010=\"\u0005\b\u0088\u0001\u0010?R \u0010'\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0089\u0001\u0010=\"\u0005\b\u008a\u0001\u0010?R \u0010(\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010=\"\u0005\b\u008c\u0001\u0010?R \u0010)\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008d\u0001\u0010=\"\u0005\b\u008e\u0001\u0010?R \u0010*\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u008f\u0001\u0010=\"\u0005\b\u0090\u0001\u0010?R\"\u0010+\u001a\u00020,8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001\"\u0006\b\u0093\u0001\u0010\u0094\u0001R \u0010-\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0095\u0001\u0010U\"\u0005\b\u0096\u0001\u0010WR \u0010.\u001a\u00020\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010C\"\u0005\b\u0098\u0001\u0010ER \u0010/\u001a\u00020\u001c8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u0099\u0001\u0010m\"\u0005\b\u009a\u0001\u0010oR$\u00100\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0002\u0010t\u001a\u0005\b\u009b\u0001\u0010q\"\u0005\b\u009c\u0001\u0010sR \u00101\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010U\"\u0005\b\u009e\u0001\u0010WR \u00102\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b\u009f\u0001\u0010=\"\u0005\b \u0001\u0010?R \u00103\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b¡\u0001\u0010=\"\u0005\b¢\u0001\u0010?R \u00104\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b£\u0001\u0010U\"\u0005\b¤\u0001\u0010W¨\u0006×\u0001"}, d2 = {"Lcom/theinnerhour/b2b/network/model/UpcomingBooking;", "Ljava/io/Serializable;", "active", "", "bookingCode", "", "bookingtype", "cancelAt", "", "createdAt", "date", "datetimeAtCustomerTimezone", "Lcom/theinnerhour/b2b/network/model/DatetimeAtTimezone;", "datetimeAtTherapistTimezone", "duration", "", "finalSellingPrice", "", "gateway", "id", "joinUrl", "npsRating", "orderid", "ozonetellsid", "partnerId", Constants.SCREEN_PROGRESS, "psychiatristId", "psychiatrist", "Lcom/theinnerhour/b2b/network/model/UpcomingProvider;", "refundPrice", "refundedAt", "remainingtime", "rescheduledAt", "rescheduledBy", "sessionCancelBy", "sessionEndedBy", "sessionPrice", "sessionendedAt", "sessionkey", "slot", "slotdatetime", "source", "status", "subscribedpackage", "Lcom/theinnerhour/b2b/model/TypeOfPackageModel;", "subscribedpackageId", "summary", "therapist", "therapistId", "transactionId", "typeofsession", "updatedAt", SessionManager.KEY_USERID, "clinicDetails", "Lcom/theinnerhour/b2b/network/model/OfflineClinicDetail;", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/network/model/DatetimeAtTimezone;Lcom/theinnerhour/b2b/network/model/DatetimeAtTimezone;IDLjava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Integer;Lcom/theinnerhour/b2b/network/model/UpcomingProvider;DLjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;DLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/model/TypeOfPackageModel;ILjava/lang/Object;Lcom/theinnerhour/b2b/network/model/UpcomingProvider;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;ILcom/theinnerhour/b2b/network/model/OfflineClinicDetail;)V", "getActive", "()Z", "setActive", "(Z)V", "getBookingCode", "()Ljava/lang/String;", "setBookingCode", "(Ljava/lang/String;)V", "getBookingtype", "setBookingtype", "getCancelAt", "()Ljava/lang/Object;", "setCancelAt", "(Ljava/lang/Object;)V", "getClinicDetails", "()Lcom/theinnerhour/b2b/network/model/OfflineClinicDetail;", "setClinicDetails", "(Lcom/theinnerhour/b2b/network/model/OfflineClinicDetail;)V", "getCreatedAt", "setCreatedAt", "getDate", "setDate", "getDatetimeAtCustomerTimezone", "()Lcom/theinnerhour/b2b/network/model/DatetimeAtTimezone;", "setDatetimeAtCustomerTimezone", "(Lcom/theinnerhour/b2b/network/model/DatetimeAtTimezone;)V", "getDatetimeAtTherapistTimezone", "setDatetimeAtTherapistTimezone", "getDuration", "()I", "setDuration", "(I)V", "getFinalSellingPrice", "()D", "setFinalSellingPrice", "(D)V", "getGateway", "setGateway", "getId", "setId", "getJoinUrl", "setJoinUrl", "getNpsRating", "setNpsRating", "getOrderid", "setOrderid", "getOzonetellsid", "setOzonetellsid", "getPartnerId", "setPartnerId", "getProgress", "setProgress", "getPsychiatrist", "()Lcom/theinnerhour/b2b/network/model/UpcomingProvider;", "setPsychiatrist", "(Lcom/theinnerhour/b2b/network/model/UpcomingProvider;)V", "getPsychiatristId", "()Ljava/lang/Integer;", "setPsychiatristId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getRefundPrice", "setRefundPrice", "getRefundedAt", "setRefundedAt", "getRemainingtime", "setRemainingtime", "getRescheduledAt", "setRescheduledAt", "getRescheduledBy", "setRescheduledBy", "getSessionCancelBy", "setSessionCancelBy", "getSessionEndedBy", "setSessionEndedBy", "getSessionPrice", "setSessionPrice", "getSessionendedAt", "setSessionendedAt", "getSessionkey", "setSessionkey", "getSlot", "setSlot", "getSlotdatetime", "setSlotdatetime", "getSource", "setSource", "getStatus", "setStatus", "getSubscribedpackage", "()Lcom/theinnerhour/b2b/model/TypeOfPackageModel;", "setSubscribedpackage", "(Lcom/theinnerhour/b2b/model/TypeOfPackageModel;)V", "getSubscribedpackageId", "setSubscribedpackageId", "getSummary", "setSummary", "getTherapist", "setTherapist", "getTherapistId", "setTherapistId", "getTransactionId", "setTransactionId", "getTypeofsession", "setTypeofsession", "getUpdatedAt", "setUpdatedAt", "getUserId", "setUserId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component3", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "component39", "component4", "component40", "component41", "component42", "component43", "component44", "component5", "component6", "component7", "component8", "component9", "copy", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/network/model/DatetimeAtTimezone;Lcom/theinnerhour/b2b/network/model/DatetimeAtTimezone;IDLjava/lang/String;ILjava/lang/String;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Integer;Lcom/theinnerhour/b2b/network/model/UpcomingProvider;DLjava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;DLjava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/theinnerhour/b2b/model/TypeOfPackageModel;ILjava/lang/Object;Lcom/theinnerhour/b2b/network/model/UpcomingProvider;Ljava/lang/Integer;ILjava/lang/String;Ljava/lang/String;ILcom/theinnerhour/b2b/network/model/OfflineClinicDetail;)Lcom/theinnerhour/b2b/network/model/UpcomingBooking;", "equals", "other", "hashCode", "toString", "app_productionRelease"}, k = 1, mv = {1, 7, 1}, xi = R.styleable.AppCompatTheme_checkboxStyle)
/* loaded from: classes2.dex */
public final class UpcomingBooking implements Serializable {
    @b("active")
    private boolean active;
    @b("booking_code")
    private String bookingCode;
    @b("bookingtype")
    private String bookingtype;
    @b("cancel_at")
    private Object cancelAt;
    @b("clinic_details")
    private OfflineClinicDetail clinicDetails;
    @b("created_at")
    private String createdAt;
    @b("date")
    private String date;
    @b("datetime_at_customer_timezone")
    private DatetimeAtTimezone datetimeAtCustomerTimezone;
    @b("datetime_at_therapist_timezone")
    private DatetimeAtTimezone datetimeAtTherapistTimezone;
    @b("duration")
    private int duration;
    @b("final_selling_price")
    private double finalSellingPrice;
    @b("gateway")
    private String gateway;
    @b("id")

    /* renamed from: id  reason: collision with root package name */
    private int f11781id;
    @b("join_url")
    private String joinUrl;
    @b("nps_rating")
    private Object npsRating;
    @b("orderid")
    private Object orderid;
    @b("ozonetellsid")
    private Object ozonetellsid;
    @b(SessionManager.KEY_PARTNER_ID)
    private Object partnerId;
    @b(Constants.SCREEN_PROGRESS)
    private int progress;
    @b("psychiatrist")
    private UpcomingProvider psychiatrist;
    @b("psychiatrist_id")
    private Integer psychiatristId;
    @b("refund_price")
    private double refundPrice;
    @b("refunded_at")
    private Object refundedAt;
    @b("remainingtime")
    private int remainingtime;
    @b("rescheduled_at")
    private Object rescheduledAt;
    @b("rescheduled_by")
    private Object rescheduledBy;
    @b("session_cancel_by")
    private Object sessionCancelBy;
    @b("session_ended_by")
    private Object sessionEndedBy;
    @b("session_price")
    private double sessionPrice;
    @b("sessionended_at")
    private Object sessionendedAt;
    @b("sessionkey")
    private String sessionkey;
    @b("slot")
    private String slot;
    @b("slotdatetime")
    private String slotdatetime;
    @b("source")
    private String source;
    @b("status")
    private String status;
    @b("subscribedpackage")
    private TypeOfPackageModel subscribedpackage;
    @b("subscribedpackage_id")
    private int subscribedpackageId;
    @b("summary")
    private Object summary;
    @b("therapist")
    private UpcomingProvider therapist;
    @b("therapist_id")
    private Integer therapistId;
    @b("transaction_id")
    private int transactionId;
    @b("typeofsession")
    private String typeofsession;
    @b("updated_at")
    private String updatedAt;
    @b("user_id")
    private int userId;

    public UpcomingBooking(boolean z10, String bookingCode, String bookingtype, Object cancelAt, String createdAt, String date, DatetimeAtTimezone datetimeAtCustomerTimezone, DatetimeAtTimezone datetimeAtTherapistTimezone, int i6, double d10, String gateway, int i10, String joinUrl, Object npsRating, Object orderid, Object ozonetellsid, Object partnerId, int i11, Integer num, UpcomingProvider psychiatrist, double d11, Object refundedAt, int i12, Object rescheduledAt, Object rescheduledBy, Object sessionCancelBy, Object sessionEndedBy, double d12, Object sessionendedAt, String sessionkey, String slot, String slotdatetime, String source, String status, TypeOfPackageModel subscribedpackage, int i13, Object summary, UpcomingProvider therapist, Integer num2, int i14, String typeofsession, String updatedAt, int i15, OfflineClinicDetail offlineClinicDetail) {
        i.g(bookingCode, "bookingCode");
        i.g(bookingtype, "bookingtype");
        i.g(cancelAt, "cancelAt");
        i.g(createdAt, "createdAt");
        i.g(date, "date");
        i.g(datetimeAtCustomerTimezone, "datetimeAtCustomerTimezone");
        i.g(datetimeAtTherapistTimezone, "datetimeAtTherapistTimezone");
        i.g(gateway, "gateway");
        i.g(joinUrl, "joinUrl");
        i.g(npsRating, "npsRating");
        i.g(orderid, "orderid");
        i.g(ozonetellsid, "ozonetellsid");
        i.g(partnerId, "partnerId");
        i.g(psychiatrist, "psychiatrist");
        i.g(refundedAt, "refundedAt");
        i.g(rescheduledAt, "rescheduledAt");
        i.g(rescheduledBy, "rescheduledBy");
        i.g(sessionCancelBy, "sessionCancelBy");
        i.g(sessionEndedBy, "sessionEndedBy");
        i.g(sessionendedAt, "sessionendedAt");
        i.g(sessionkey, "sessionkey");
        i.g(slot, "slot");
        i.g(slotdatetime, "slotdatetime");
        i.g(source, "source");
        i.g(status, "status");
        i.g(subscribedpackage, "subscribedpackage");
        i.g(summary, "summary");
        i.g(therapist, "therapist");
        i.g(typeofsession, "typeofsession");
        i.g(updatedAt, "updatedAt");
        this.active = z10;
        this.bookingCode = bookingCode;
        this.bookingtype = bookingtype;
        this.cancelAt = cancelAt;
        this.createdAt = createdAt;
        this.date = date;
        this.datetimeAtCustomerTimezone = datetimeAtCustomerTimezone;
        this.datetimeAtTherapistTimezone = datetimeAtTherapistTimezone;
        this.duration = i6;
        this.finalSellingPrice = d10;
        this.gateway = gateway;
        this.f11781id = i10;
        this.joinUrl = joinUrl;
        this.npsRating = npsRating;
        this.orderid = orderid;
        this.ozonetellsid = ozonetellsid;
        this.partnerId = partnerId;
        this.progress = i11;
        this.psychiatristId = num;
        this.psychiatrist = psychiatrist;
        this.refundPrice = d11;
        this.refundedAt = refundedAt;
        this.remainingtime = i12;
        this.rescheduledAt = rescheduledAt;
        this.rescheduledBy = rescheduledBy;
        this.sessionCancelBy = sessionCancelBy;
        this.sessionEndedBy = sessionEndedBy;
        this.sessionPrice = d12;
        this.sessionendedAt = sessionendedAt;
        this.sessionkey = sessionkey;
        this.slot = slot;
        this.slotdatetime = slotdatetime;
        this.source = source;
        this.status = status;
        this.subscribedpackage = subscribedpackage;
        this.subscribedpackageId = i13;
        this.summary = summary;
        this.therapist = therapist;
        this.therapistId = num2;
        this.transactionId = i14;
        this.typeofsession = typeofsession;
        this.updatedAt = updatedAt;
        this.userId = i15;
        this.clinicDetails = offlineClinicDetail;
    }

    public static /* synthetic */ UpcomingBooking copy$default(UpcomingBooking upcomingBooking, boolean z10, String str, String str2, Object obj, String str3, String str4, DatetimeAtTimezone datetimeAtTimezone, DatetimeAtTimezone datetimeAtTimezone2, int i6, double d10, String str5, int i10, String str6, Object obj2, Object obj3, Object obj4, Object obj5, int i11, Integer num, UpcomingProvider upcomingProvider, double d11, Object obj6, int i12, Object obj7, Object obj8, Object obj9, Object obj10, double d12, Object obj11, String str7, String str8, String str9, String str10, String str11, TypeOfPackageModel typeOfPackageModel, int i13, Object obj12, UpcomingProvider upcomingProvider2, Integer num2, int i14, String str12, String str13, int i15, OfflineClinicDetail offlineClinicDetail, int i16, int i17, Object obj13) {
        boolean z11 = (i16 & 1) != 0 ? upcomingBooking.active : z10;
        String str14 = (i16 & 2) != 0 ? upcomingBooking.bookingCode : str;
        String str15 = (i16 & 4) != 0 ? upcomingBooking.bookingtype : str2;
        Object obj14 = (i16 & 8) != 0 ? upcomingBooking.cancelAt : obj;
        String str16 = (i16 & 16) != 0 ? upcomingBooking.createdAt : str3;
        String str17 = (i16 & 32) != 0 ? upcomingBooking.date : str4;
        DatetimeAtTimezone datetimeAtTimezone3 = (i16 & 64) != 0 ? upcomingBooking.datetimeAtCustomerTimezone : datetimeAtTimezone;
        DatetimeAtTimezone datetimeAtTimezone4 = (i16 & 128) != 0 ? upcomingBooking.datetimeAtTherapistTimezone : datetimeAtTimezone2;
        int i18 = (i16 & 256) != 0 ? upcomingBooking.duration : i6;
        double d13 = (i16 & 512) != 0 ? upcomingBooking.finalSellingPrice : d10;
        String str18 = (i16 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? upcomingBooking.gateway : str5;
        return upcomingBooking.copy(z11, str14, str15, obj14, str16, str17, datetimeAtTimezone3, datetimeAtTimezone4, i18, d13, str18, (i16 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? upcomingBooking.f11781id : i10, (i16 & 4096) != 0 ? upcomingBooking.joinUrl : str6, (i16 & 8192) != 0 ? upcomingBooking.npsRating : obj2, (i16 & 16384) != 0 ? upcomingBooking.orderid : obj3, (i16 & 32768) != 0 ? upcomingBooking.ozonetellsid : obj4, (i16 & 65536) != 0 ? upcomingBooking.partnerId : obj5, (i16 & 131072) != 0 ? upcomingBooking.progress : i11, (i16 & 262144) != 0 ? upcomingBooking.psychiatristId : num, (i16 & 524288) != 0 ? upcomingBooking.psychiatrist : upcomingProvider, (i16 & 1048576) != 0 ? upcomingBooking.refundPrice : d11, (i16 & 2097152) != 0 ? upcomingBooking.refundedAt : obj6, (4194304 & i16) != 0 ? upcomingBooking.remainingtime : i12, (i16 & 8388608) != 0 ? upcomingBooking.rescheduledAt : obj7, (i16 & 16777216) != 0 ? upcomingBooking.rescheduledBy : obj8, (i16 & 33554432) != 0 ? upcomingBooking.sessionCancelBy : obj9, (i16 & 67108864) != 0 ? upcomingBooking.sessionEndedBy : obj10, (i16 & 134217728) != 0 ? upcomingBooking.sessionPrice : d12, (i16 & 268435456) != 0 ? upcomingBooking.sessionendedAt : obj11, (536870912 & i16) != 0 ? upcomingBooking.sessionkey : str7, (i16 & 1073741824) != 0 ? upcomingBooking.slot : str8, (i16 & LinearLayoutManager.INVALID_OFFSET) != 0 ? upcomingBooking.slotdatetime : str9, (i17 & 1) != 0 ? upcomingBooking.source : str10, (i17 & 2) != 0 ? upcomingBooking.status : str11, (i17 & 4) != 0 ? upcomingBooking.subscribedpackage : typeOfPackageModel, (i17 & 8) != 0 ? upcomingBooking.subscribedpackageId : i13, (i17 & 16) != 0 ? upcomingBooking.summary : obj12, (i17 & 32) != 0 ? upcomingBooking.therapist : upcomingProvider2, (i17 & 64) != 0 ? upcomingBooking.therapistId : num2, (i17 & 128) != 0 ? upcomingBooking.transactionId : i14, (i17 & 256) != 0 ? upcomingBooking.typeofsession : str12, (i17 & 512) != 0 ? upcomingBooking.updatedAt : str13, (i17 & Constants.CAMPAIGN_ASSET_DOWNLOAD_JOB_ID) != 0 ? upcomingBooking.userId : i15, (i17 & Constants.PROFILE_ASSET_DOWNLOAD_JOB_ID) != 0 ? upcomingBooking.clinicDetails : offlineClinicDetail);
    }

    public final boolean component1() {
        return this.active;
    }

    public final double component10() {
        return this.finalSellingPrice;
    }

    public final String component11() {
        return this.gateway;
    }

    public final int component12() {
        return this.f11781id;
    }

    public final String component13() {
        return this.joinUrl;
    }

    public final Object component14() {
        return this.npsRating;
    }

    public final Object component15() {
        return this.orderid;
    }

    public final Object component16() {
        return this.ozonetellsid;
    }

    public final Object component17() {
        return this.partnerId;
    }

    public final int component18() {
        return this.progress;
    }

    public final Integer component19() {
        return this.psychiatristId;
    }

    public final String component2() {
        return this.bookingCode;
    }

    public final UpcomingProvider component20() {
        return this.psychiatrist;
    }

    public final double component21() {
        return this.refundPrice;
    }

    public final Object component22() {
        return this.refundedAt;
    }

    public final int component23() {
        return this.remainingtime;
    }

    public final Object component24() {
        return this.rescheduledAt;
    }

    public final Object component25() {
        return this.rescheduledBy;
    }

    public final Object component26() {
        return this.sessionCancelBy;
    }

    public final Object component27() {
        return this.sessionEndedBy;
    }

    public final double component28() {
        return this.sessionPrice;
    }

    public final Object component29() {
        return this.sessionendedAt;
    }

    public final String component3() {
        return this.bookingtype;
    }

    public final String component30() {
        return this.sessionkey;
    }

    public final String component31() {
        return this.slot;
    }

    public final String component32() {
        return this.slotdatetime;
    }

    public final String component33() {
        return this.source;
    }

    public final String component34() {
        return this.status;
    }

    public final TypeOfPackageModel component35() {
        return this.subscribedpackage;
    }

    public final int component36() {
        return this.subscribedpackageId;
    }

    public final Object component37() {
        return this.summary;
    }

    public final UpcomingProvider component38() {
        return this.therapist;
    }

    public final Integer component39() {
        return this.therapistId;
    }

    public final Object component4() {
        return this.cancelAt;
    }

    public final int component40() {
        return this.transactionId;
    }

    public final String component41() {
        return this.typeofsession;
    }

    public final String component42() {
        return this.updatedAt;
    }

    public final int component43() {
        return this.userId;
    }

    public final OfflineClinicDetail component44() {
        return this.clinicDetails;
    }

    public final String component5() {
        return this.createdAt;
    }

    public final String component6() {
        return this.date;
    }

    public final DatetimeAtTimezone component7() {
        return this.datetimeAtCustomerTimezone;
    }

    public final DatetimeAtTimezone component8() {
        return this.datetimeAtTherapistTimezone;
    }

    public final int component9() {
        return this.duration;
    }

    public final UpcomingBooking copy(boolean z10, String bookingCode, String bookingtype, Object cancelAt, String createdAt, String date, DatetimeAtTimezone datetimeAtCustomerTimezone, DatetimeAtTimezone datetimeAtTherapistTimezone, int i6, double d10, String gateway, int i10, String joinUrl, Object npsRating, Object orderid, Object ozonetellsid, Object partnerId, int i11, Integer num, UpcomingProvider psychiatrist, double d11, Object refundedAt, int i12, Object rescheduledAt, Object rescheduledBy, Object sessionCancelBy, Object sessionEndedBy, double d12, Object sessionendedAt, String sessionkey, String slot, String slotdatetime, String source, String status, TypeOfPackageModel subscribedpackage, int i13, Object summary, UpcomingProvider therapist, Integer num2, int i14, String typeofsession, String updatedAt, int i15, OfflineClinicDetail offlineClinicDetail) {
        i.g(bookingCode, "bookingCode");
        i.g(bookingtype, "bookingtype");
        i.g(cancelAt, "cancelAt");
        i.g(createdAt, "createdAt");
        i.g(date, "date");
        i.g(datetimeAtCustomerTimezone, "datetimeAtCustomerTimezone");
        i.g(datetimeAtTherapistTimezone, "datetimeAtTherapistTimezone");
        i.g(gateway, "gateway");
        i.g(joinUrl, "joinUrl");
        i.g(npsRating, "npsRating");
        i.g(orderid, "orderid");
        i.g(ozonetellsid, "ozonetellsid");
        i.g(partnerId, "partnerId");
        i.g(psychiatrist, "psychiatrist");
        i.g(refundedAt, "refundedAt");
        i.g(rescheduledAt, "rescheduledAt");
        i.g(rescheduledBy, "rescheduledBy");
        i.g(sessionCancelBy, "sessionCancelBy");
        i.g(sessionEndedBy, "sessionEndedBy");
        i.g(sessionendedAt, "sessionendedAt");
        i.g(sessionkey, "sessionkey");
        i.g(slot, "slot");
        i.g(slotdatetime, "slotdatetime");
        i.g(source, "source");
        i.g(status, "status");
        i.g(subscribedpackage, "subscribedpackage");
        i.g(summary, "summary");
        i.g(therapist, "therapist");
        i.g(typeofsession, "typeofsession");
        i.g(updatedAt, "updatedAt");
        return new UpcomingBooking(z10, bookingCode, bookingtype, cancelAt, createdAt, date, datetimeAtCustomerTimezone, datetimeAtTherapistTimezone, i6, d10, gateway, i10, joinUrl, npsRating, orderid, ozonetellsid, partnerId, i11, num, psychiatrist, d11, refundedAt, i12, rescheduledAt, rescheduledBy, sessionCancelBy, sessionEndedBy, d12, sessionendedAt, sessionkey, slot, slotdatetime, source, status, subscribedpackage, i13, summary, therapist, num2, i14, typeofsession, updatedAt, i15, offlineClinicDetail);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpcomingBooking)) {
            return false;
        }
        UpcomingBooking upcomingBooking = (UpcomingBooking) obj;
        if (this.active == upcomingBooking.active && i.b(this.bookingCode, upcomingBooking.bookingCode) && i.b(this.bookingtype, upcomingBooking.bookingtype) && i.b(this.cancelAt, upcomingBooking.cancelAt) && i.b(this.createdAt, upcomingBooking.createdAt) && i.b(this.date, upcomingBooking.date) && i.b(this.datetimeAtCustomerTimezone, upcomingBooking.datetimeAtCustomerTimezone) && i.b(this.datetimeAtTherapistTimezone, upcomingBooking.datetimeAtTherapistTimezone) && this.duration == upcomingBooking.duration && Double.compare(this.finalSellingPrice, upcomingBooking.finalSellingPrice) == 0 && i.b(this.gateway, upcomingBooking.gateway) && this.f11781id == upcomingBooking.f11781id && i.b(this.joinUrl, upcomingBooking.joinUrl) && i.b(this.npsRating, upcomingBooking.npsRating) && i.b(this.orderid, upcomingBooking.orderid) && i.b(this.ozonetellsid, upcomingBooking.ozonetellsid) && i.b(this.partnerId, upcomingBooking.partnerId) && this.progress == upcomingBooking.progress && i.b(this.psychiatristId, upcomingBooking.psychiatristId) && i.b(this.psychiatrist, upcomingBooking.psychiatrist) && Double.compare(this.refundPrice, upcomingBooking.refundPrice) == 0 && i.b(this.refundedAt, upcomingBooking.refundedAt) && this.remainingtime == upcomingBooking.remainingtime && i.b(this.rescheduledAt, upcomingBooking.rescheduledAt) && i.b(this.rescheduledBy, upcomingBooking.rescheduledBy) && i.b(this.sessionCancelBy, upcomingBooking.sessionCancelBy) && i.b(this.sessionEndedBy, upcomingBooking.sessionEndedBy) && Double.compare(this.sessionPrice, upcomingBooking.sessionPrice) == 0 && i.b(this.sessionendedAt, upcomingBooking.sessionendedAt) && i.b(this.sessionkey, upcomingBooking.sessionkey) && i.b(this.slot, upcomingBooking.slot) && i.b(this.slotdatetime, upcomingBooking.slotdatetime) && i.b(this.source, upcomingBooking.source) && i.b(this.status, upcomingBooking.status) && i.b(this.subscribedpackage, upcomingBooking.subscribedpackage) && this.subscribedpackageId == upcomingBooking.subscribedpackageId && i.b(this.summary, upcomingBooking.summary) && i.b(this.therapist, upcomingBooking.therapist) && i.b(this.therapistId, upcomingBooking.therapistId) && this.transactionId == upcomingBooking.transactionId && i.b(this.typeofsession, upcomingBooking.typeofsession) && i.b(this.updatedAt, upcomingBooking.updatedAt) && this.userId == upcomingBooking.userId && i.b(this.clinicDetails, upcomingBooking.clinicDetails)) {
            return true;
        }
        return false;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final String getBookingCode() {
        return this.bookingCode;
    }

    public final String getBookingtype() {
        return this.bookingtype;
    }

    public final Object getCancelAt() {
        return this.cancelAt;
    }

    public final OfflineClinicDetail getClinicDetails() {
        return this.clinicDetails;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final String getDate() {
        return this.date;
    }

    public final DatetimeAtTimezone getDatetimeAtCustomerTimezone() {
        return this.datetimeAtCustomerTimezone;
    }

    public final DatetimeAtTimezone getDatetimeAtTherapistTimezone() {
        return this.datetimeAtTherapistTimezone;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final double getFinalSellingPrice() {
        return this.finalSellingPrice;
    }

    public final String getGateway() {
        return this.gateway;
    }

    public final int getId() {
        return this.f11781id;
    }

    public final String getJoinUrl() {
        return this.joinUrl;
    }

    public final Object getNpsRating() {
        return this.npsRating;
    }

    public final Object getOrderid() {
        return this.orderid;
    }

    public final Object getOzonetellsid() {
        return this.ozonetellsid;
    }

    public final Object getPartnerId() {
        return this.partnerId;
    }

    public final int getProgress() {
        return this.progress;
    }

    public final UpcomingProvider getPsychiatrist() {
        return this.psychiatrist;
    }

    public final Integer getPsychiatristId() {
        return this.psychiatristId;
    }

    public final double getRefundPrice() {
        return this.refundPrice;
    }

    public final Object getRefundedAt() {
        return this.refundedAt;
    }

    public final int getRemainingtime() {
        return this.remainingtime;
    }

    public final Object getRescheduledAt() {
        return this.rescheduledAt;
    }

    public final Object getRescheduledBy() {
        return this.rescheduledBy;
    }

    public final Object getSessionCancelBy() {
        return this.sessionCancelBy;
    }

    public final Object getSessionEndedBy() {
        return this.sessionEndedBy;
    }

    public final double getSessionPrice() {
        return this.sessionPrice;
    }

    public final Object getSessionendedAt() {
        return this.sessionendedAt;
    }

    public final String getSessionkey() {
        return this.sessionkey;
    }

    public final String getSlot() {
        return this.slot;
    }

    public final String getSlotdatetime() {
        return this.slotdatetime;
    }

    public final String getSource() {
        return this.source;
    }

    public final String getStatus() {
        return this.status;
    }

    public final TypeOfPackageModel getSubscribedpackage() {
        return this.subscribedpackage;
    }

    public final int getSubscribedpackageId() {
        return this.subscribedpackageId;
    }

    public final Object getSummary() {
        return this.summary;
    }

    public final UpcomingProvider getTherapist() {
        return this.therapist;
    }

    public final Integer getTherapistId() {
        return this.therapistId;
    }

    public final int getTransactionId() {
        return this.transactionId;
    }

    public final String getTypeofsession() {
        return this.typeofsession;
    }

    public final String getUpdatedAt() {
        return this.updatedAt;
    }

    public final int getUserId() {
        return this.userId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v71 */
    /* JADX WARN: Type inference failed for: r0v72 */
    public int hashCode() {
        int hashCode;
        int hashCode2;
        boolean z10 = this.active;
        ?? r02 = z10;
        if (z10) {
            r02 = 1;
        }
        int c10 = a.c(this.bookingtype, a.c(this.bookingCode, r02 * 31, 31), 31);
        int c11 = a.c(this.date, a.c(this.createdAt, (this.cancelAt.hashCode() + c10) * 31, 31), 31);
        int hashCode3 = this.datetimeAtTherapistTimezone.hashCode();
        long doubleToLongBits = Double.doubleToLongBits(this.finalSellingPrice);
        String str = this.gateway;
        int c12 = a.c(this.joinUrl, (a.c(str, (((((hashCode3 + ((this.datetimeAtCustomerTimezone.hashCode() + c11) * 31)) * 31) + this.duration) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31, 31) + this.f11781id) * 31, 31);
        int hashCode4 = this.orderid.hashCode();
        int hashCode5 = this.ozonetellsid.hashCode();
        int hashCode6 = (((this.partnerId.hashCode() + ((hashCode5 + ((hashCode4 + ((this.npsRating.hashCode() + c12) * 31)) * 31)) * 31)) * 31) + this.progress) * 31;
        Integer num = this.psychiatristId;
        int i6 = 0;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int hashCode7 = this.psychiatrist.hashCode();
        long doubleToLongBits2 = Double.doubleToLongBits(this.refundPrice);
        int hashCode8 = this.refundedAt.hashCode();
        int hashCode9 = this.rescheduledAt.hashCode();
        int hashCode10 = this.rescheduledBy.hashCode();
        int hashCode11 = this.sessionCancelBy.hashCode();
        int hashCode12 = this.sessionEndedBy.hashCode();
        long doubleToLongBits3 = Double.doubleToLongBits(this.sessionPrice);
        int hashCode13 = this.sessionendedAt.hashCode();
        int c13 = a.c(this.status, a.c(this.source, a.c(this.slotdatetime, a.c(this.slot, a.c(this.sessionkey, (hashCode13 + ((((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((((hashCode8 + ((((hashCode7 + ((hashCode6 + hashCode) * 31)) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31)) * 31) + this.remainingtime) * 31)) * 31)) * 31)) * 31)) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31)) * 31, 31), 31), 31), 31), 31);
        int hashCode14 = this.summary.hashCode();
        int hashCode15 = (this.therapist.hashCode() + ((hashCode14 + ((((this.subscribedpackage.hashCode() + c13) * 31) + this.subscribedpackageId) * 31)) * 31)) * 31;
        Integer num2 = this.therapistId;
        if (num2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num2.hashCode();
        }
        int c14 = (a.c(this.updatedAt, a.c(this.typeofsession, (((hashCode15 + hashCode2) * 31) + this.transactionId) * 31, 31), 31) + this.userId) * 31;
        OfflineClinicDetail offlineClinicDetail = this.clinicDetails;
        if (offlineClinicDetail != null) {
            i6 = offlineClinicDetail.hashCode();
        }
        return c14 + i6;
    }

    public final void setActive(boolean z10) {
        this.active = z10;
    }

    public final void setBookingCode(String str) {
        i.g(str, "<set-?>");
        this.bookingCode = str;
    }

    public final void setBookingtype(String str) {
        i.g(str, "<set-?>");
        this.bookingtype = str;
    }

    public final void setCancelAt(Object obj) {
        i.g(obj, "<set-?>");
        this.cancelAt = obj;
    }

    public final void setClinicDetails(OfflineClinicDetail offlineClinicDetail) {
        this.clinicDetails = offlineClinicDetail;
    }

    public final void setCreatedAt(String str) {
        i.g(str, "<set-?>");
        this.createdAt = str;
    }

    public final void setDate(String str) {
        i.g(str, "<set-?>");
        this.date = str;
    }

    public final void setDatetimeAtCustomerTimezone(DatetimeAtTimezone datetimeAtTimezone) {
        i.g(datetimeAtTimezone, "<set-?>");
        this.datetimeAtCustomerTimezone = datetimeAtTimezone;
    }

    public final void setDatetimeAtTherapistTimezone(DatetimeAtTimezone datetimeAtTimezone) {
        i.g(datetimeAtTimezone, "<set-?>");
        this.datetimeAtTherapistTimezone = datetimeAtTimezone;
    }

    public final void setDuration(int i6) {
        this.duration = i6;
    }

    public final void setFinalSellingPrice(double d10) {
        this.finalSellingPrice = d10;
    }

    public final void setGateway(String str) {
        i.g(str, "<set-?>");
        this.gateway = str;
    }

    public final void setId(int i6) {
        this.f11781id = i6;
    }

    public final void setJoinUrl(String str) {
        i.g(str, "<set-?>");
        this.joinUrl = str;
    }

    public final void setNpsRating(Object obj) {
        i.g(obj, "<set-?>");
        this.npsRating = obj;
    }

    public final void setOrderid(Object obj) {
        i.g(obj, "<set-?>");
        this.orderid = obj;
    }

    public final void setOzonetellsid(Object obj) {
        i.g(obj, "<set-?>");
        this.ozonetellsid = obj;
    }

    public final void setPartnerId(Object obj) {
        i.g(obj, "<set-?>");
        this.partnerId = obj;
    }

    public final void setProgress(int i6) {
        this.progress = i6;
    }

    public final void setPsychiatrist(UpcomingProvider upcomingProvider) {
        i.g(upcomingProvider, "<set-?>");
        this.psychiatrist = upcomingProvider;
    }

    public final void setPsychiatristId(Integer num) {
        this.psychiatristId = num;
    }

    public final void setRefundPrice(double d10) {
        this.refundPrice = d10;
    }

    public final void setRefundedAt(Object obj) {
        i.g(obj, "<set-?>");
        this.refundedAt = obj;
    }

    public final void setRemainingtime(int i6) {
        this.remainingtime = i6;
    }

    public final void setRescheduledAt(Object obj) {
        i.g(obj, "<set-?>");
        this.rescheduledAt = obj;
    }

    public final void setRescheduledBy(Object obj) {
        i.g(obj, "<set-?>");
        this.rescheduledBy = obj;
    }

    public final void setSessionCancelBy(Object obj) {
        i.g(obj, "<set-?>");
        this.sessionCancelBy = obj;
    }

    public final void setSessionEndedBy(Object obj) {
        i.g(obj, "<set-?>");
        this.sessionEndedBy = obj;
    }

    public final void setSessionPrice(double d10) {
        this.sessionPrice = d10;
    }

    public final void setSessionendedAt(Object obj) {
        i.g(obj, "<set-?>");
        this.sessionendedAt = obj;
    }

    public final void setSessionkey(String str) {
        i.g(str, "<set-?>");
        this.sessionkey = str;
    }

    public final void setSlot(String str) {
        i.g(str, "<set-?>");
        this.slot = str;
    }

    public final void setSlotdatetime(String str) {
        i.g(str, "<set-?>");
        this.slotdatetime = str;
    }

    public final void setSource(String str) {
        i.g(str, "<set-?>");
        this.source = str;
    }

    public final void setStatus(String str) {
        i.g(str, "<set-?>");
        this.status = str;
    }

    public final void setSubscribedpackage(TypeOfPackageModel typeOfPackageModel) {
        i.g(typeOfPackageModel, "<set-?>");
        this.subscribedpackage = typeOfPackageModel;
    }

    public final void setSubscribedpackageId(int i6) {
        this.subscribedpackageId = i6;
    }

    public final void setSummary(Object obj) {
        i.g(obj, "<set-?>");
        this.summary = obj;
    }

    public final void setTherapist(UpcomingProvider upcomingProvider) {
        i.g(upcomingProvider, "<set-?>");
        this.therapist = upcomingProvider;
    }

    public final void setTherapistId(Integer num) {
        this.therapistId = num;
    }

    public final void setTransactionId(int i6) {
        this.transactionId = i6;
    }

    public final void setTypeofsession(String str) {
        i.g(str, "<set-?>");
        this.typeofsession = str;
    }

    public final void setUpdatedAt(String str) {
        i.g(str, "<set-?>");
        this.updatedAt = str;
    }

    public final void setUserId(int i6) {
        this.userId = i6;
    }

    public String toString() {
        return "UpcomingBooking(active=" + this.active + ", bookingCode=" + this.bookingCode + ", bookingtype=" + this.bookingtype + ", cancelAt=" + this.cancelAt + ", createdAt=" + this.createdAt + ", date=" + this.date + ", datetimeAtCustomerTimezone=" + this.datetimeAtCustomerTimezone + ", datetimeAtTherapistTimezone=" + this.datetimeAtTherapistTimezone + ", duration=" + this.duration + ", finalSellingPrice=" + this.finalSellingPrice + ", gateway=" + this.gateway + ", id=" + this.f11781id + ", joinUrl=" + this.joinUrl + ", npsRating=" + this.npsRating + ", orderid=" + this.orderid + ", ozonetellsid=" + this.ozonetellsid + ", partnerId=" + this.partnerId + ", progress=" + this.progress + ", psychiatristId=" + this.psychiatristId + ", psychiatrist=" + this.psychiatrist + ", refundPrice=" + this.refundPrice + ", refundedAt=" + this.refundedAt + ", remainingtime=" + this.remainingtime + ", rescheduledAt=" + this.rescheduledAt + ", rescheduledBy=" + this.rescheduledBy + ", sessionCancelBy=" + this.sessionCancelBy + ", sessionEndedBy=" + this.sessionEndedBy + ", sessionPrice=" + this.sessionPrice + ", sessionendedAt=" + this.sessionendedAt + ", sessionkey=" + this.sessionkey + ", slot=" + this.slot + ", slotdatetime=" + this.slotdatetime + ", source=" + this.source + ", status=" + this.status + ", subscribedpackage=" + this.subscribedpackage + ", subscribedpackageId=" + this.subscribedpackageId + ", summary=" + this.summary + ", therapist=" + this.therapist + ", therapistId=" + this.therapistId + ", transactionId=" + this.transactionId + ", typeofsession=" + this.typeofsession + ", updatedAt=" + this.updatedAt + ", userId=" + this.userId + ", clinicDetails=" + this.clinicDetails + ')';
    }

    public /* synthetic */ UpcomingBooking(boolean z10, String str, String str2, Object obj, String str3, String str4, DatetimeAtTimezone datetimeAtTimezone, DatetimeAtTimezone datetimeAtTimezone2, int i6, double d10, String str5, int i10, String str6, Object obj2, Object obj3, Object obj4, Object obj5, int i11, Integer num, UpcomingProvider upcomingProvider, double d11, Object obj6, int i12, Object obj7, Object obj8, Object obj9, Object obj10, double d12, Object obj11, String str7, String str8, String str9, String str10, String str11, TypeOfPackageModel typeOfPackageModel, int i13, Object obj12, UpcomingProvider upcomingProvider2, Integer num2, int i14, String str12, String str13, int i15, OfflineClinicDetail offlineClinicDetail, int i16, int i17, d dVar) {
        this(z10, str, str2, obj, str3, str4, datetimeAtTimezone, datetimeAtTimezone2, i6, d10, str5, i10, str6, obj2, obj3, obj4, obj5, i11, (i16 & 262144) != 0 ? null : num, upcomingProvider, d11, obj6, i12, obj7, obj8, obj9, obj10, d12, obj11, str7, str8, str9, str10, str11, typeOfPackageModel, i13, obj12, upcomingProvider2, (i17 & 64) != 0 ? null : num2, i14, str12, str13, i15, offlineClinicDetail);
    }
}
