package io.grpc.netty.shaded.io.netty.handler.codec.http;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.channel.ChannelHandlerContext;
import io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder;
import io.grpc.netty.shaded.io.netty.handler.codec.DecoderResult;
import io.grpc.netty.shaded.io.netty.handler.codec.PrematureChannelClosureException;
import io.grpc.netty.shaded.io.netty.handler.codec.TooLongFrameException;
import io.grpc.netty.shaded.io.netty.util.ByteProcessor;
import io.grpc.netty.shaded.io.netty.util.internal.AppendableCharSequence;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import java.util.List;
import java.util.regex.Pattern;
/* loaded from: classes4.dex */
public abstract class HttpObjectDecoder extends ByteToMessageDecoder {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final Pattern COMMA_PATTERN = Pattern.compile(",");
    public static final boolean DEFAULT_ALLOW_DUPLICATE_CONTENT_LENGTHS = false;
    public static final boolean DEFAULT_CHUNKED_SUPPORTED = true;
    public static final int DEFAULT_INITIAL_BUFFER_SIZE = 128;
    public static final int DEFAULT_MAX_CHUNK_SIZE = 8192;
    public static final int DEFAULT_MAX_HEADER_SIZE = 8192;
    public static final int DEFAULT_MAX_INITIAL_LINE_LENGTH = 4096;
    public static final boolean DEFAULT_VALIDATE_HEADERS = true;
    private static final String EMPTY_VALUE = "";
    private final boolean allowDuplicateContentLengths;
    private long chunkSize;
    private final boolean chunkedSupported;
    private long contentLength;
    private State currentState;
    private final HeaderParser headerParser;
    private final LineParser lineParser;
    private final int maxChunkSize;
    private HttpMessage message;
    private CharSequence name;
    private volatile boolean resetRequested;
    private LastHttpContent trailer;
    protected final boolean validateHeaders;
    private CharSequence value;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum State {
        SKIP_CONTROL_CHARS,
        READ_INITIAL,
        READ_HEADER,
        READ_VARIABLE_LENGTH_CONTENT,
        READ_FIXED_LENGTH_CONTENT,
        READ_CHUNK_SIZE,
        READ_CHUNKED_CONTENT,
        READ_CHUNK_DELIMITER,
        READ_CHUNK_FOOTER,
        BAD_MESSAGE,
        UPGRADED
    }

    private static boolean isOWS(char c) {
        return c == ' ' || c == '\t';
    }

    private static boolean isSPLenient(char c) {
        return c == ' ' || c == '\t' || c == 11 || c == '\f' || c == '\r';
    }

    protected abstract HttpMessage createInvalidMessage();

    protected abstract HttpMessage createMessage(String[] strArr) throws Exception;

    protected abstract boolean isDecodingRequest();

    /* JADX INFO: Access modifiers changed from: protected */
    public HttpObjectDecoder() {
        this(4096, 8192, 8192, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HttpObjectDecoder(int i, int i2, int i3, boolean z) {
        this(i, i2, i3, z, true);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HttpObjectDecoder(int i, int i2, int i3, boolean z, boolean z2) {
        this(i, i2, i3, z, z2, 128);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HttpObjectDecoder(int i, int i2, int i3, boolean z, boolean z2, int i4) {
        this(i, i2, i3, z, z2, i4, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public HttpObjectDecoder(int i, int i2, int i3, boolean z, boolean z2, int i4, boolean z3) {
        this.contentLength = Long.MIN_VALUE;
        this.currentState = State.SKIP_CONTROL_CHARS;
        ObjectUtil.checkPositive(i, "maxInitialLineLength");
        ObjectUtil.checkPositive(i2, "maxHeaderSize");
        ObjectUtil.checkPositive(i3, "maxChunkSize");
        AppendableCharSequence appendableCharSequence = new AppendableCharSequence(i4);
        this.lineParser = new LineParser(appendableCharSequence, i);
        this.headerParser = new HeaderParser(appendableCharSequence, i2);
        this.maxChunkSize = i3;
        this.chunkedSupported = z;
        this.validateHeaders = z2;
        this.allowDuplicateContentLengths = z3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0106 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0139 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013a A[Catch: Exception -> 0x0199, TryCatch #2 {Exception -> 0x0199, blocks: (B:69:0x0133, B:72:0x013a, B:76:0x014a, B:80:0x0158, B:83:0x015f, B:85:0x0168, B:87:0x016b, B:89:0x0179, B:91:0x017d, B:93:0x0183, B:94:0x018a, B:95:0x018b), top: B:106:0x0133 }] */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        State readHeaders;
        int writerIndex;
        int readerIndex;
        int i;
        int min;
        if (this.resetRequested) {
            resetNow();
        }
        switch (AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[this.currentState.ordinal()]) {
            case 1:
            case 3:
                try {
                    AppendableCharSequence parse = this.lineParser.parse(byteBuf);
                    if (parse == null) {
                        return;
                    }
                    String[] splitInitialLine = splitInitialLine(parse);
                    if (splitInitialLine.length < 3) {
                        this.currentState = State.SKIP_CONTROL_CHARS;
                        return;
                    }
                    this.message = createMessage(splitInitialLine);
                    this.currentState = State.READ_HEADER;
                    try {
                        readHeaders = readHeaders(byteBuf);
                        if (readHeaders != null) {
                            return;
                        }
                        this.currentState = readHeaders;
                        int i2 = AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[readHeaders.ordinal()];
                        if (i2 == 1) {
                            list.add(this.message);
                            list.add(LastHttpContent.EMPTY_LAST_CONTENT);
                            resetNow();
                            return;
                        } else if (i2 == 2) {
                            if (!this.chunkedSupported) {
                                throw new IllegalArgumentException("Chunked messages not supported");
                            }
                            list.add(this.message);
                            return;
                        } else {
                            long contentLength = contentLength();
                            if (contentLength != 0 && (contentLength != -1 || !isDecodingRequest())) {
                                list.add(this.message);
                                if (readHeaders == State.READ_FIXED_LENGTH_CONTENT) {
                                    this.chunkSize = contentLength;
                                    return;
                                }
                                return;
                            }
                            list.add(this.message);
                            list.add(LastHttpContent.EMPTY_LAST_CONTENT);
                            resetNow();
                            return;
                        }
                    } catch (Exception e) {
                        list.add(invalidMessage(byteBuf, e));
                        return;
                    }
                } catch (Exception e2) {
                    list.add(invalidMessage(byteBuf, e2));
                    return;
                }
            case 2:
                try {
                    AppendableCharSequence parse2 = this.lineParser.parse(byteBuf);
                    if (parse2 == null) {
                        return;
                    }
                    int chunkSize = getChunkSize(parse2.toString());
                    this.chunkSize = chunkSize;
                    if (chunkSize == 0) {
                        this.currentState = State.READ_CHUNK_FOOTER;
                        return;
                    }
                    this.currentState = State.READ_CHUNKED_CONTENT;
                    min = Math.min(Math.min((int) this.chunkSize, this.maxChunkSize), byteBuf.readableBytes());
                    if (min != 0) {
                        return;
                    }
                    DefaultHttpContent defaultHttpContent = new DefaultHttpContent(byteBuf.readRetainedSlice(min));
                    this.chunkSize -= min;
                    list.add(defaultHttpContent);
                    if (this.chunkSize != 0) {
                        return;
                    }
                    this.currentState = State.READ_CHUNK_DELIMITER;
                    writerIndex = byteBuf.writerIndex();
                    readerIndex = byteBuf.readerIndex();
                    while (true) {
                        if (writerIndex <= readerIndex) {
                            i = readerIndex + 1;
                            if (byteBuf.getByte(readerIndex) == 10) {
                                this.currentState = State.READ_CHUNK_SIZE;
                                readerIndex = i;
                            } else {
                                readerIndex = i;
                            }
                        }
                    }
                    byteBuf.readerIndex(readerIndex);
                    return;
                } catch (Exception e3) {
                    list.add(invalidChunk(byteBuf, e3));
                    return;
                }
            case 4:
                readHeaders = readHeaders(byteBuf);
                if (readHeaders != null) {
                }
                break;
            case 5:
                int min2 = Math.min(byteBuf.readableBytes(), this.maxChunkSize);
                if (min2 > 0) {
                    list.add(new DefaultHttpContent(byteBuf.readRetainedSlice(min2)));
                    return;
                }
                return;
            case 6:
                int readableBytes = byteBuf.readableBytes();
                if (readableBytes == 0) {
                    return;
                }
                int min3 = Math.min(readableBytes, this.maxChunkSize);
                long j = this.chunkSize;
                if (min3 > j) {
                    min3 = (int) j;
                }
                ByteBuf readRetainedSlice = byteBuf.readRetainedSlice(min3);
                long j2 = this.chunkSize - min3;
                this.chunkSize = j2;
                if (j2 == 0) {
                    list.add(new DefaultLastHttpContent(readRetainedSlice, this.validateHeaders));
                    resetNow();
                    return;
                }
                list.add(new DefaultHttpContent(readRetainedSlice));
                return;
            case 7:
                min = Math.min(Math.min((int) this.chunkSize, this.maxChunkSize), byteBuf.readableBytes());
                if (min != 0) {
                }
                break;
            case 8:
                writerIndex = byteBuf.writerIndex();
                readerIndex = byteBuf.readerIndex();
                while (true) {
                    if (writerIndex <= readerIndex) {
                    }
                    readerIndex = i;
                }
                byteBuf.readerIndex(readerIndex);
                return;
            case 9:
                try {
                    LastHttpContent readTrailingHeaders = readTrailingHeaders(byteBuf);
                    if (readTrailingHeaders == null) {
                        return;
                    }
                    list.add(readTrailingHeaders);
                    resetNow();
                    return;
                } catch (Exception e4) {
                    list.add(invalidChunk(byteBuf, e4));
                    return;
                }
            case 10:
                byteBuf.skipBytes(byteBuf.readableBytes());
                return;
            case 11:
                int readableBytes2 = byteBuf.readableBytes();
                if (readableBytes2 > 0) {
                    list.add(byteBuf.readBytes(readableBytes2));
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: io.grpc.netty.shaded.io.netty.handler.codec.http.HttpObjectDecoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State = iArr;
            try {
                iArr[State.SKIP_CONTROL_CHARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.READ_CHUNK_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.READ_INITIAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.READ_HEADER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.READ_VARIABLE_LENGTH_CONTENT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.READ_FIXED_LENGTH_CONTENT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.READ_CHUNKED_CONTENT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.READ_CHUNK_DELIMITER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.READ_CHUNK_FOOTER.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.BAD_MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[State.UPGRADED.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder
    public void decodeLast(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        super.decodeLast(channelHandlerContext, byteBuf, list);
        if (this.resetRequested) {
            resetNow();
        }
        HttpMessage httpMessage = this.message;
        if (httpMessage != null) {
            boolean isTransferEncodingChunked = HttpUtil.isTransferEncodingChunked(httpMessage);
            if (this.currentState == State.READ_VARIABLE_LENGTH_CONTENT && !byteBuf.isReadable() && !isTransferEncodingChunked) {
                list.add(LastHttpContent.EMPTY_LAST_CONTENT);
                resetNow();
            } else if (this.currentState == State.READ_HEADER) {
                list.add(invalidMessage(Unpooled.EMPTY_BUFFER, new PrematureChannelClosureException("Connection closed before received headers")));
                resetNow();
            } else {
                boolean z = true;
                if (!isDecodingRequest() && !isTransferEncodingChunked && contentLength() <= 0) {
                    z = false;
                }
                if (!z) {
                    list.add(LastHttpContent.EMPTY_LAST_CONTENT);
                }
                resetNow();
            }
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.ByteToMessageDecoder, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandlerAdapter, io.grpc.netty.shaded.io.netty.channel.ChannelInboundHandler
    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object obj) throws Exception {
        int i;
        if ((obj instanceof HttpExpectationFailedEvent) && ((i = AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$HttpObjectDecoder$State[this.currentState.ordinal()]) == 2 || i == 5 || i == 6)) {
            reset();
        }
        super.userEventTriggered(channelHandlerContext, obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean isContentAlwaysEmpty(HttpMessage httpMessage) {
        if (httpMessage instanceof HttpResponse) {
            HttpResponse httpResponse = (HttpResponse) httpMessage;
            int code = httpResponse.status().code();
            if (code >= 100 && code < 200) {
                return (code == 101 && !httpResponse.headers().contains(HttpHeaderNames.SEC_WEBSOCKET_ACCEPT) && httpResponse.headers().contains((CharSequence) HttpHeaderNames.UPGRADE, (CharSequence) HttpHeaderValues.WEBSOCKET, true)) ? false : true;
            } else if (code == 204 || code == 304) {
                return true;
            }
        }
        return false;
    }

    protected boolean isSwitchingToNonHttp1Protocol(HttpResponse httpResponse) {
        if (httpResponse.status().code() != HttpResponseStatus.SWITCHING_PROTOCOLS.code()) {
            return false;
        }
        String str = httpResponse.headers().get(HttpHeaderNames.UPGRADE);
        return str == null || !(str.contains(HttpVersion.HTTP_1_0.text()) || str.contains(HttpVersion.HTTP_1_1.text()));
    }

    public void reset() {
        this.resetRequested = true;
    }

    private void resetNow() {
        HttpResponse httpResponse;
        HttpMessage httpMessage = this.message;
        this.message = null;
        this.name = null;
        this.value = null;
        this.contentLength = Long.MIN_VALUE;
        this.lineParser.reset();
        this.headerParser.reset();
        this.trailer = null;
        if (!isDecodingRequest() && (httpResponse = (HttpResponse) httpMessage) != null && isSwitchingToNonHttp1Protocol(httpResponse)) {
            this.currentState = State.UPGRADED;
            return;
        }
        this.resetRequested = false;
        this.currentState = State.SKIP_CONTROL_CHARS;
    }

    private HttpMessage invalidMessage(ByteBuf byteBuf, Exception exc) {
        this.currentState = State.BAD_MESSAGE;
        byteBuf.skipBytes(byteBuf.readableBytes());
        if (this.message == null) {
            this.message = createInvalidMessage();
        }
        this.message.setDecoderResult(DecoderResult.failure(exc));
        HttpMessage httpMessage = this.message;
        this.message = null;
        return httpMessage;
    }

    private HttpContent invalidChunk(ByteBuf byteBuf, Exception exc) {
        this.currentState = State.BAD_MESSAGE;
        byteBuf.skipBytes(byteBuf.readableBytes());
        DefaultLastHttpContent defaultLastHttpContent = new DefaultLastHttpContent(Unpooled.EMPTY_BUFFER);
        defaultLastHttpContent.setDecoderResult(DecoderResult.failure(exc));
        this.message = null;
        this.trailer = null;
        return defaultLastHttpContent;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private State readHeaders(ByteBuf byteBuf) {
        CharSequence charSequence;
        List<String> all;
        HttpMessage httpMessage = this.message;
        HttpHeaders headers = httpMessage.headers();
        AppendableCharSequence parse = this.headerParser.parse(byteBuf);
        String str = null;
        if (parse == null) {
            return null;
        }
        if (parse.length() > 0) {
            do {
                char charAtUnsafe = parse.charAtUnsafe(0);
                CharSequence charSequence2 = this.name;
                if (charSequence2 != null && (charAtUnsafe == ' ' || charAtUnsafe == '\t')) {
                    this.value = String.valueOf(this.value) + ' ' + parse.toString().trim();
                } else {
                    if (charSequence2 != null) {
                        headers.add(charSequence2, this.value);
                    }
                    splitHeader(parse);
                }
                parse = this.headerParser.parse(byteBuf);
                if (parse == null) {
                    return null;
                }
            } while (parse.length() > 0);
            charSequence = this.name;
            if (charSequence != null) {
                headers.add(charSequence, this.value);
            }
            this.name = null;
            this.value = null;
            all = headers.getAll(HttpHeaderNames.CONTENT_LENGTH);
            if (!all.isEmpty()) {
                boolean z = true;
                if (all.size() <= 1 && all.get(0).indexOf(44) < 0) {
                    z = false;
                }
                if (z && httpMessage.protocolVersion() == HttpVersion.HTTP_1_1) {
                    if (this.allowDuplicateContentLengths) {
                        for (String str2 : all) {
                            for (String str3 : COMMA_PATTERN.split(str2, -1)) {
                                String trim = str3.trim();
                                if (str == null) {
                                    str = trim;
                                } else if (!trim.equals(str)) {
                                    throw new IllegalArgumentException("Multiple Content-Length values found: " + all);
                                }
                            }
                        }
                        headers.set(HttpHeaderNames.CONTENT_LENGTH, str);
                        this.contentLength = Long.parseLong(str);
                    } else {
                        throw new IllegalArgumentException("Multiple Content-Length values found: " + all);
                    }
                } else {
                    this.contentLength = Long.parseLong(all.get(0));
                }
            }
            if (!isContentAlwaysEmpty(httpMessage)) {
                HttpUtil.setTransferEncodingChunked(httpMessage, false);
                return State.SKIP_CONTROL_CHARS;
            } else if (HttpUtil.isTransferEncodingChunked(httpMessage)) {
                if (!all.isEmpty() && httpMessage.protocolVersion() == HttpVersion.HTTP_1_1) {
                    handleTransferEncodingChunkedWithContentLength(httpMessage);
                }
                return State.READ_CHUNK_SIZE;
            } else if (contentLength() >= 0) {
                return State.READ_FIXED_LENGTH_CONTENT;
            } else {
                return State.READ_VARIABLE_LENGTH_CONTENT;
            }
        }
        charSequence = this.name;
        if (charSequence != null) {
        }
        this.name = null;
        this.value = null;
        all = headers.getAll(HttpHeaderNames.CONTENT_LENGTH);
        if (!all.isEmpty()) {
        }
        if (!isContentAlwaysEmpty(httpMessage)) {
        }
    }

    protected void handleTransferEncodingChunkedWithContentLength(HttpMessage httpMessage) {
        httpMessage.headers().remove(HttpHeaderNames.CONTENT_LENGTH);
        this.contentLength = Long.MIN_VALUE;
    }

    private long contentLength() {
        if (this.contentLength == Long.MIN_VALUE) {
            this.contentLength = HttpUtil.getContentLength(this.message, -1L);
        }
        return this.contentLength;
    }

    private LastHttpContent readTrailingHeaders(ByteBuf byteBuf) {
        int size;
        AppendableCharSequence parse = this.headerParser.parse(byteBuf);
        if (parse == null) {
            return null;
        }
        LastHttpContent lastHttpContent = this.trailer;
        if (parse.length() == 0 && lastHttpContent == null) {
            return LastHttpContent.EMPTY_LAST_CONTENT;
        }
        if (lastHttpContent == null) {
            lastHttpContent = new DefaultLastHttpContent(Unpooled.EMPTY_BUFFER, this.validateHeaders);
            this.trailer = lastHttpContent;
        }
        CharSequence charSequence = null;
        while (parse.length() > 0) {
            char charAtUnsafe = parse.charAtUnsafe(0);
            if (charSequence != null && (charAtUnsafe == ' ' || charAtUnsafe == '\t')) {
                List<String> all = lastHttpContent.trailingHeaders().getAll(charSequence);
                if (!all.isEmpty()) {
                    all.set(all.size() - 1, all.get(size) + parse.toString().trim());
                }
            } else {
                splitHeader(parse);
                CharSequence charSequence2 = this.name;
                if (!HttpHeaderNames.CONTENT_LENGTH.contentEqualsIgnoreCase(charSequence2) && !HttpHeaderNames.TRANSFER_ENCODING.contentEqualsIgnoreCase(charSequence2) && !HttpHeaderNames.TRAILER.contentEqualsIgnoreCase(charSequence2)) {
                    lastHttpContent.trailingHeaders().add(charSequence2, this.value);
                }
                charSequence = this.name;
                this.name = null;
                this.value = null;
            }
            parse = this.headerParser.parse(byteBuf);
            if (parse == null) {
                return null;
            }
        }
        this.trailer = null;
        return lastHttpContent;
    }

    private static int getChunkSize(String str) {
        String trim = str.trim();
        for (int i = 0; i < trim.length(); i++) {
            char charAt = trim.charAt(i);
            if (charAt == ';' || Character.isWhitespace(charAt) || Character.isISOControl(charAt)) {
                trim = trim.substring(0, i);
                break;
            }
        }
        return Integer.parseInt(trim, 16);
    }

    private static String[] splitInitialLine(AppendableCharSequence appendableCharSequence) {
        int findNonSPLenient = findNonSPLenient(appendableCharSequence, 0);
        int findSPLenient = findSPLenient(appendableCharSequence, findNonSPLenient);
        int findNonSPLenient2 = findNonSPLenient(appendableCharSequence, findSPLenient);
        int findSPLenient2 = findSPLenient(appendableCharSequence, findNonSPLenient2);
        int findNonSPLenient3 = findNonSPLenient(appendableCharSequence, findSPLenient2);
        int findEndOfString = findEndOfString(appendableCharSequence);
        String[] strArr = new String[3];
        strArr[0] = appendableCharSequence.subStringUnsafe(findNonSPLenient, findSPLenient);
        strArr[1] = appendableCharSequence.subStringUnsafe(findNonSPLenient2, findSPLenient2);
        strArr[2] = findNonSPLenient3 < findEndOfString ? appendableCharSequence.subStringUnsafe(findNonSPLenient3, findEndOfString) : "";
        return strArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        r4 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        if (r4 >= r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002d, code lost:
        if (r7.charAtUnsafe(r4) != ':') goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002f, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0032, code lost:
        r4 = r4 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
        r6.name = r7.subStringUnsafe(r1, r2);
        r1 = findNonWhitespace(r7, r4, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0040, code lost:
        if (r1 != r0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
        r6.value = "";
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0047, code lost:
        r6.value = r7.subStringUnsafe(r1, findEndOfString(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void splitHeader(AppendableCharSequence appendableCharSequence) {
        char charAtUnsafe;
        int length = appendableCharSequence.length();
        int findNonWhitespace = findNonWhitespace(appendableCharSequence, 0, false);
        int i = findNonWhitespace;
        while (i < length && (charAtUnsafe = appendableCharSequence.charAtUnsafe(i)) != ':' && (isDecodingRequest() || !isOWS(charAtUnsafe))) {
            i++;
        }
        throw new IllegalArgumentException("No colon found");
    }

    private static int findNonSPLenient(AppendableCharSequence appendableCharSequence, int i) {
        while (i < appendableCharSequence.length()) {
            char charAtUnsafe = appendableCharSequence.charAtUnsafe(i);
            if (!isSPLenient(charAtUnsafe)) {
                if (Character.isWhitespace(charAtUnsafe)) {
                    throw new IllegalArgumentException("Invalid separator");
                }
                return i;
            }
            i++;
        }
        return appendableCharSequence.length();
    }

    private static int findSPLenient(AppendableCharSequence appendableCharSequence, int i) {
        while (i < appendableCharSequence.length()) {
            if (isSPLenient(appendableCharSequence.charAtUnsafe(i))) {
                return i;
            }
            i++;
        }
        return appendableCharSequence.length();
    }

    private static int findNonWhitespace(AppendableCharSequence appendableCharSequence, int i, boolean z) {
        while (i < appendableCharSequence.length()) {
            char charAtUnsafe = appendableCharSequence.charAtUnsafe(i);
            if (!Character.isWhitespace(charAtUnsafe)) {
                return i;
            }
            if (z && !isOWS(charAtUnsafe)) {
                throw new IllegalArgumentException("Invalid separator, only a single space or horizontal tab allowed, but received a '" + charAtUnsafe + "'");
            }
            i++;
        }
        return appendableCharSequence.length();
    }

    private static int findEndOfString(AppendableCharSequence appendableCharSequence) {
        for (int length = appendableCharSequence.length() - 1; length > 0; length--) {
            if (!Character.isWhitespace(appendableCharSequence.charAtUnsafe(length))) {
                return length + 1;
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static class HeaderParser implements ByteProcessor {
        private final int maxLength;
        private final AppendableCharSequence seq;
        private int size;

        HeaderParser(AppendableCharSequence appendableCharSequence, int i) {
            this.seq = appendableCharSequence;
            this.maxLength = i;
        }

        public AppendableCharSequence parse(ByteBuf byteBuf) {
            int i = this.size;
            this.seq.reset();
            int forEachByte = byteBuf.forEachByte(this);
            if (forEachByte == -1) {
                this.size = i;
                return null;
            }
            byteBuf.readerIndex(forEachByte + 1);
            return this.seq;
        }

        public void reset() {
            this.size = 0;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.ByteProcessor
        public boolean process(byte b) throws Exception {
            char c = (char) (b & 255);
            if (c == '\n') {
                int length = this.seq.length();
                if (length >= 1) {
                    int i = length - 1;
                    if (this.seq.charAtUnsafe(i) == '\r') {
                        this.size--;
                        this.seq.setLength(i);
                        return false;
                    }
                    return false;
                }
                return false;
            }
            increaseCount();
            this.seq.append(c);
            return true;
        }

        protected final void increaseCount() {
            int i = this.size + 1;
            this.size = i;
            int i2 = this.maxLength;
            if (i > i2) {
                throw newException(i2);
            }
        }

        protected TooLongFrameException newException(int i) {
            return new TooLongFrameException("HTTP header is larger than " + i + " bytes.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class LineParser extends HeaderParser {
        LineParser(AppendableCharSequence appendableCharSequence, int i) {
            super(appendableCharSequence, i);
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpObjectDecoder.HeaderParser
        public AppendableCharSequence parse(ByteBuf byteBuf) {
            reset();
            return super.parse(byteBuf);
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpObjectDecoder.HeaderParser, io.grpc.netty.shaded.io.netty.util.ByteProcessor
        public boolean process(byte b) throws Exception {
            if (HttpObjectDecoder.this.currentState == State.SKIP_CONTROL_CHARS) {
                char c = (char) (b & 255);
                if (Character.isISOControl(c) || Character.isWhitespace(c)) {
                    increaseCount();
                    return true;
                }
                HttpObjectDecoder.this.currentState = State.READ_INITIAL;
            }
            return super.process(b);
        }

        @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.HttpObjectDecoder.HeaderParser
        protected TooLongFrameException newException(int i) {
            return new TooLongFrameException("An HTTP line is larger than " + i + " bytes.");
        }
    }
}
