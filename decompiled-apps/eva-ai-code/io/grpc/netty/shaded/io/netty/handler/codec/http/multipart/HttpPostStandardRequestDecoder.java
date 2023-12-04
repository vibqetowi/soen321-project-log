package io.grpc.netty.shaded.io.netty.handler.codec.http.multipart;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpConstants;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpContent;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpRequest;
import io.grpc.netty.shaded.io.netty.handler.codec.http.LastHttpContent;
import io.grpc.netty.shaded.io.netty.handler.codec.http.QueryStringDecoder;
import io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.HttpPostBodyUtil;
import io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.HttpPostRequestDecoder;
import io.grpc.netty.shaded.io.netty.util.ByteProcessor;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
import io.grpc.netty.shaded.io.netty.util.internal.PlatformDependent;
import io.grpc.netty.shaded.io.netty.util.internal.StringUtil;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
/* loaded from: classes4.dex */
public class HttpPostStandardRequestDecoder implements InterfaceHttpPostRequestDecoder {
    private final List<InterfaceHttpData> bodyListHttpData;
    private int bodyListHttpDataRank;
    private final Map<String, List<InterfaceHttpData>> bodyMapHttpData;
    private final Charset charset;
    private Attribute currentAttribute;
    private HttpPostRequestDecoder.MultiPartStatus currentStatus;
    private boolean destroyed;
    private int discardThreshold;
    private final HttpDataFactory factory;
    private boolean isLastChunk;
    private final HttpRequest request;
    private ByteBuf undecodedChunk;

    public HttpPostStandardRequestDecoder(HttpRequest httpRequest) {
        this(new DefaultHttpDataFactory(16384L), httpRequest, HttpConstants.DEFAULT_CHARSET);
    }

    public HttpPostStandardRequestDecoder(HttpDataFactory httpDataFactory, HttpRequest httpRequest) {
        this(httpDataFactory, httpRequest, HttpConstants.DEFAULT_CHARSET);
    }

    public HttpPostStandardRequestDecoder(HttpDataFactory httpDataFactory, HttpRequest httpRequest, Charset charset) {
        this.bodyListHttpData = new ArrayList();
        this.bodyMapHttpData = new TreeMap(CaseIgnoringComparator.INSTANCE);
        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED;
        this.discardThreshold = 10485760;
        this.request = (HttpRequest) ObjectUtil.checkNotNull(httpRequest, "request");
        this.charset = (Charset) ObjectUtil.checkNotNull(charset, "charset");
        this.factory = (HttpDataFactory) ObjectUtil.checkNotNull(httpDataFactory, "factory");
        try {
            if (httpRequest instanceof HttpContent) {
                offer((HttpContent) httpRequest);
            } else {
                parseBody();
            }
        } catch (Throwable th) {
            destroy();
            PlatformDependent.throwException(th);
        }
    }

    private void checkDestroyed() {
        if (this.destroyed) {
            throw new IllegalStateException("HttpPostStandardRequestDecoder was destroyed already");
        }
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public boolean isMultipart() {
        checkDestroyed();
        return false;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void setDiscardThreshold(int i) {
        this.discardThreshold = ObjectUtil.checkPositiveOrZero(i, "discardThreshold");
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public int getDiscardThreshold() {
        return this.discardThreshold;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public List<InterfaceHttpData> getBodyHttpDatas() {
        checkDestroyed();
        if (!this.isLastChunk) {
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        }
        return this.bodyListHttpData;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public List<InterfaceHttpData> getBodyHttpDatas(String str) {
        checkDestroyed();
        if (!this.isLastChunk) {
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        }
        return this.bodyMapHttpData.get(str);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public InterfaceHttpData getBodyHttpData(String str) {
        checkDestroyed();
        if (!this.isLastChunk) {
            throw new HttpPostRequestDecoder.NotEnoughDataDecoderException();
        }
        List<InterfaceHttpData> list = this.bodyMapHttpData.get(str);
        if (list != null) {
            return list.get(0);
        }
        return null;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public HttpPostStandardRequestDecoder offer(HttpContent httpContent) {
        ByteBuf writeBytes;
        checkDestroyed();
        if (httpContent instanceof LastHttpContent) {
            this.isLastChunk = true;
        }
        ByteBuf content = httpContent.content();
        ByteBuf byteBuf = this.undecodedChunk;
        if (byteBuf == null) {
            if (this.isLastChunk) {
                writeBytes = content.retainedSlice();
            } else {
                writeBytes = content.alloc().buffer(content.readableBytes()).writeBytes(content);
            }
            this.undecodedChunk = writeBytes;
        } else {
            byteBuf.writeBytes(content);
        }
        parseBody();
        ByteBuf byteBuf2 = this.undecodedChunk;
        if (byteBuf2 != null && byteBuf2.writerIndex() > this.discardThreshold) {
            this.undecodedChunk.discardReadBytes();
        }
        return this;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public boolean hasNext() {
        checkDestroyed();
        if (this.currentStatus != HttpPostRequestDecoder.MultiPartStatus.EPILOGUE || this.bodyListHttpDataRank < this.bodyListHttpData.size()) {
            return !this.bodyListHttpData.isEmpty() && this.bodyListHttpDataRank < this.bodyListHttpData.size();
        }
        throw new HttpPostRequestDecoder.EndOfDataDecoderException();
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public InterfaceHttpData next() {
        checkDestroyed();
        if (hasNext()) {
            List<InterfaceHttpData> list = this.bodyListHttpData;
            int i = this.bodyListHttpDataRank;
            this.bodyListHttpDataRank = i + 1;
            return list.get(i);
        }
        return null;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public InterfaceHttpData currentPartialHttpData() {
        return this.currentAttribute;
    }

    private void parseBody() {
        if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE || this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.EPILOGUE) {
            if (this.isLastChunk) {
                this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.EPILOGUE;
                return;
            }
            return;
        }
        parseBodyAttributes();
    }

    protected void addHttpData(InterfaceHttpData interfaceHttpData) {
        if (interfaceHttpData == null) {
            return;
        }
        List<InterfaceHttpData> list = this.bodyMapHttpData.get(interfaceHttpData.getName());
        if (list == null) {
            list = new ArrayList<>(1);
            this.bodyMapHttpData.put(interfaceHttpData.getName(), list);
        }
        list.add(interfaceHttpData);
        this.bodyListHttpData.add(interfaceHttpData);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ee, code lost:
        if (r9.isLastChunk == false) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f0, code lost:
        r1 = r9.currentAttribute;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00f2, code lost:
        if (r1 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00f4, code lost:
        if (r0 <= r2) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00f6, code lost:
        setFinalBuffer(r9.undecodedChunk.retainedSlice(r2, r0 - r2));
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0106, code lost:
        if (r1.isCompleted() != false) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0108, code lost:
        setFinalBuffer(io.grpc.netty.shaded.io.netty.buffer.Unpooled.EMPTY_BUFFER);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x010d, code lost:
        r9.currentStatus = io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.EPILOGUE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0112, code lost:
        if (r3 == false) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0116, code lost:
        if (r9.currentAttribute == null) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011c, code lost:
        if (r9.currentStatus != io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.MultiPartStatus.FIELD) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x011e, code lost:
        r9.currentAttribute.addContent(r9.undecodedChunk.retainedSlice(r2, r0 - r2), false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x012c, code lost:
        r0 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x012d, code lost:
        r9.undecodedChunk.readerIndex(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0132, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0133, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0134, code lost:
        r2 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0137, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0138, code lost:
        r2 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x013b, code lost:
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x013c, code lost:
        r2 = r0;
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0140, code lost:
        r9.undecodedChunk.readerIndex(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x014a, code lost:
        throw new io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x014c, code lost:
        r9.undecodedChunk.readerIndex(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0156, code lost:
        throw new io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.HttpPostRequestDecoder.ErrorDataDecoderException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0158, code lost:
        r9.undecodedChunk.readerIndex(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x015d, code lost:
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void parseBodyAttributesStandard() {
        int readerIndex = this.undecodedChunk.readerIndex();
        if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED) {
            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
        }
        loop0: while (true) {
            int i = readerIndex;
            boolean z = true;
            while (this.undecodedChunk.isReadable() && z) {
                try {
                    char readUnsignedByte = (char) this.undecodedChunk.readUnsignedByte();
                    readerIndex++;
                    int i2 = AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[this.currentStatus.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            if (readUnsignedByte == '&') {
                                this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
                                setFinalBuffer(this.undecodedChunk.retainedSlice(i, (readerIndex - 1) - i));
                            } else if (readUnsignedByte == '\r') {
                                if (this.undecodedChunk.isReadable()) {
                                    readerIndex++;
                                    if (((char) this.undecodedChunk.readUnsignedByte()) == '\n') {
                                        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE;
                                        setFinalBuffer(this.undecodedChunk.retainedSlice(i, (readerIndex - 2) - i));
                                        i = readerIndex;
                                    } else {
                                        throw new HttpPostRequestDecoder.ErrorDataDecoderException("Bad end of line");
                                    }
                                } else {
                                    readerIndex--;
                                }
                            } else if (readUnsignedByte == '\n') {
                                this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE;
                                setFinalBuffer(this.undecodedChunk.retainedSlice(i, (readerIndex - 1) - i));
                                i = readerIndex;
                            }
                        }
                        z = false;
                    } else if (readUnsignedByte == '=') {
                        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.FIELD;
                        this.currentAttribute = this.factory.createAttribute(this.request, decodeAttribute(this.undecodedChunk.toString(i, (readerIndex - 1) - i, this.charset), this.charset));
                        i = readerIndex;
                    } else if (readUnsignedByte == '&') {
                        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
                        Attribute createAttribute = this.factory.createAttribute(this.request, decodeAttribute(this.undecodedChunk.toString(i, (readerIndex - 1) - i, this.charset), this.charset));
                        this.currentAttribute = createAttribute;
                        createAttribute.setValue("");
                        addHttpData(this.currentAttribute);
                        this.currentAttribute = null;
                    }
                } catch (HttpPostRequestDecoder.ErrorDataDecoderException e) {
                    e = e;
                } catch (IOException e2) {
                    e = e2;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.HttpPostStandardRequestDecoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus;

        static {
            int[] iArr = new int[HttpPostRequestDecoder.MultiPartStatus.values().length];
            $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus = iArr;
            try {
                iArr[HttpPostRequestDecoder.MultiPartStatus.DISPOSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[HttpPostRequestDecoder.MultiPartStatus.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private void parseBodyAttributes() {
        int i;
        boolean z;
        Attribute attribute;
        ByteBuf byteBuf = this.undecodedChunk;
        if (byteBuf == null) {
            return;
        }
        if (!byteBuf.hasArray()) {
            parseBodyAttributesStandard();
            return;
        }
        HttpPostBodyUtil.SeekAheadOptimize seekAheadOptimize = new HttpPostBodyUtil.SeekAheadOptimize(this.undecodedChunk);
        int readerIndex = this.undecodedChunk.readerIndex();
        if (this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.NOTSTARTED) {
            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
        }
        loop0: while (true) {
            i = readerIndex;
            while (true) {
                try {
                    z = true;
                    if (seekAheadOptimize.pos >= seekAheadOptimize.limit) {
                        break loop0;
                    }
                    byte[] bArr = seekAheadOptimize.bytes;
                    int i2 = seekAheadOptimize.pos;
                    seekAheadOptimize.pos = i2 + 1;
                    char c = (char) (bArr[i2] & 255);
                    readerIndex++;
                    int i3 = AnonymousClass1.$SwitchMap$io$netty$handler$codec$http$multipart$HttpPostRequestDecoder$MultiPartStatus[this.currentStatus.ordinal()];
                    if (i3 != 1) {
                        if (i3 != 2) {
                            seekAheadOptimize.setReadPosition(0);
                            break loop0;
                        } else if (c == '&') {
                            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
                            setFinalBuffer(this.undecodedChunk.retainedSlice(i, (readerIndex - 1) - i));
                            break;
                        } else if (c == '\r') {
                            if (seekAheadOptimize.pos < seekAheadOptimize.limit) {
                                byte[] bArr2 = seekAheadOptimize.bytes;
                                int i4 = seekAheadOptimize.pos;
                                seekAheadOptimize.pos = i4 + 1;
                                readerIndex++;
                                if (((char) (bArr2[i4] & 255)) == '\n') {
                                    this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE;
                                    seekAheadOptimize.setReadPosition(0);
                                    setFinalBuffer(this.undecodedChunk.retainedSlice(i, (readerIndex - 2) - i));
                                } else {
                                    seekAheadOptimize.setReadPosition(0);
                                    throw new HttpPostRequestDecoder.ErrorDataDecoderException("Bad end of line");
                                }
                            } else if (seekAheadOptimize.limit > 0) {
                                readerIndex--;
                            }
                        } else if (c == '\n') {
                            this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.PREEPILOGUE;
                            seekAheadOptimize.setReadPosition(0);
                            setFinalBuffer(this.undecodedChunk.retainedSlice(i, (readerIndex - 1) - i));
                            break loop0;
                        }
                    } else if (c == '=') {
                        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.FIELD;
                        this.currentAttribute = this.factory.createAttribute(this.request, decodeAttribute(this.undecodedChunk.toString(i, (readerIndex - 1) - i, this.charset), this.charset));
                        break;
                    } else if (c == '&') {
                        this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.DISPOSITION;
                        Attribute createAttribute = this.factory.createAttribute(this.request, decodeAttribute(this.undecodedChunk.toString(i, (readerIndex - 1) - i, this.charset), this.charset));
                        this.currentAttribute = createAttribute;
                        createAttribute.setValue("");
                        addHttpData(this.currentAttribute);
                        this.currentAttribute = null;
                        break;
                    }
                } catch (HttpPostRequestDecoder.ErrorDataDecoderException e) {
                    e = e;
                } catch (IOException e2) {
                    e = e2;
                } catch (IllegalArgumentException e3) {
                    e = e3;
                }
            }
        }
        i = readerIndex;
        z = false;
        if (this.isLastChunk && (attribute = this.currentAttribute) != null) {
            if (readerIndex > i) {
                setFinalBuffer(this.undecodedChunk.retainedSlice(i, readerIndex - i));
            } else if (!attribute.isCompleted()) {
                setFinalBuffer(Unpooled.EMPTY_BUFFER);
            }
            try {
                this.currentStatus = HttpPostRequestDecoder.MultiPartStatus.EPILOGUE;
            } catch (HttpPostRequestDecoder.ErrorDataDecoderException e4) {
                e = e4;
                i = readerIndex;
                this.undecodedChunk.readerIndex(i);
                throw e;
            } catch (IOException e5) {
                e = e5;
                i = readerIndex;
                this.undecodedChunk.readerIndex(i);
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            } catch (IllegalArgumentException e6) {
                e = e6;
                i = readerIndex;
                this.undecodedChunk.readerIndex(i);
                throw new HttpPostRequestDecoder.ErrorDataDecoderException(e);
            }
        } else {
            if (z && this.currentAttribute != null && this.currentStatus == HttpPostRequestDecoder.MultiPartStatus.FIELD) {
                this.currentAttribute.addContent(this.undecodedChunk.retainedSlice(i, readerIndex - i), false);
            }
            this.undecodedChunk.readerIndex(i);
        }
        i = readerIndex;
        this.undecodedChunk.readerIndex(i);
    }

    private void setFinalBuffer(ByteBuf byteBuf) throws IOException {
        this.currentAttribute.addContent(byteBuf, true);
        ByteBuf decodeAttribute = decodeAttribute(this.currentAttribute.getByteBuf(), this.charset);
        if (decodeAttribute != null) {
            this.currentAttribute.setContent(decodeAttribute);
        }
        addHttpData(this.currentAttribute);
        this.currentAttribute = null;
    }

    private static String decodeAttribute(String str, Charset charset) {
        try {
            return QueryStringDecoder.decodeComponent(str, charset);
        } catch (IllegalArgumentException e) {
            throw new HttpPostRequestDecoder.ErrorDataDecoderException("Bad string: '" + str + '\'', e);
        }
    }

    private static ByteBuf decodeAttribute(ByteBuf byteBuf, Charset charset) {
        if (byteBuf.forEachByte(new UrlEncodedDetector(null)) == -1) {
            return null;
        }
        ByteBuf buffer = byteBuf.alloc().buffer(byteBuf.readableBytes());
        UrlDecoder urlDecoder = new UrlDecoder(buffer);
        int forEachByte = byteBuf.forEachByte(urlDecoder);
        if (urlDecoder.nextEscapedIdx != 0) {
            if (forEachByte == -1) {
                forEachByte = byteBuf.readableBytes() - 1;
            }
            int i = forEachByte - (urlDecoder.nextEscapedIdx - 1);
            buffer.release();
            throw new HttpPostRequestDecoder.ErrorDataDecoderException(String.format("Invalid hex byte at index '%d' in string: '%s'", Integer.valueOf(i), byteBuf.toString(charset)));
        }
        return buffer;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void destroy() {
        cleanFiles();
        this.destroyed = true;
        ByteBuf byteBuf = this.undecodedChunk;
        if (byteBuf == null || byteBuf.refCnt() <= 0) {
            return;
        }
        this.undecodedChunk.release();
        this.undecodedChunk = null;
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void cleanFiles() {
        checkDestroyed();
        this.factory.cleanRequestHttpData(this.request);
    }

    @Override // io.grpc.netty.shaded.io.netty.handler.codec.http.multipart.InterfaceHttpPostRequestDecoder
    public void removeHttpDataFromClean(InterfaceHttpData interfaceHttpData) {
        checkDestroyed();
        this.factory.removeHttpDataFromClean(this.request, interfaceHttpData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class UrlEncodedDetector implements ByteProcessor {
        @Override // io.grpc.netty.shaded.io.netty.util.ByteProcessor
        public boolean process(byte b) throws Exception {
            return (b == 37 || b == 43) ? false : true;
        }

        private UrlEncodedDetector() {
        }

        /* synthetic */ UrlEncodedDetector(AnonymousClass1 anonymousClass1) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class UrlDecoder implements ByteProcessor {
        private byte hiByte;
        private int nextEscapedIdx;
        private final ByteBuf output;

        UrlDecoder(ByteBuf byteBuf) {
            this.output = byteBuf;
        }

        @Override // io.grpc.netty.shaded.io.netty.util.ByteProcessor
        public boolean process(byte b) {
            int i = this.nextEscapedIdx;
            if (i != 0) {
                if (i == 1) {
                    this.hiByte = b;
                    this.nextEscapedIdx = i + 1;
                } else {
                    int decodeHexNibble = StringUtil.decodeHexNibble((char) this.hiByte);
                    int decodeHexNibble2 = StringUtil.decodeHexNibble((char) b);
                    if (decodeHexNibble == -1 || decodeHexNibble2 == -1) {
                        this.nextEscapedIdx++;
                        return false;
                    }
                    this.output.writeByte((decodeHexNibble << 4) + decodeHexNibble2);
                    this.nextEscapedIdx = 0;
                }
            } else if (b == 37) {
                this.nextEscapedIdx = 1;
            } else if (b == 43) {
                this.output.writeByte(32);
            } else {
                this.output.writeByte(b);
            }
            return true;
        }
    }
}
