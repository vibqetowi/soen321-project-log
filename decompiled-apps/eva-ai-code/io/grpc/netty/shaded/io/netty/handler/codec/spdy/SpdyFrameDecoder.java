package io.grpc.netty.shaded.io.netty.handler.codec.spdy;

import io.grpc.netty.shaded.io.netty.buffer.ByteBuf;
import io.grpc.netty.shaded.io.netty.buffer.Unpooled;
import io.grpc.netty.shaded.io.netty.util.internal.ObjectUtil;
/* loaded from: classes4.dex */
public class SpdyFrameDecoder {
    private final SpdyFrameDecoderDelegate delegate;
    private byte flags;
    private int length;
    private final int maxChunkSize;
    private int numSettings;
    private final int spdyVersion;
    private State state;
    private int streamId;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public enum State {
        READ_COMMON_HEADER,
        READ_DATA_FRAME,
        READ_SYN_STREAM_FRAME,
        READ_SYN_REPLY_FRAME,
        READ_RST_STREAM_FRAME,
        READ_SETTINGS_FRAME,
        READ_SETTING,
        READ_PING_FRAME,
        READ_GOAWAY_FRAME,
        READ_HEADERS_FRAME,
        READ_WINDOW_UPDATE_FRAME,
        READ_HEADER_BLOCK,
        DISCARD_FRAME,
        FRAME_ERROR
    }

    private static boolean hasFlag(byte b, byte b2) {
        return (b & b2) != 0;
    }

    private static boolean isValidFrameHeader(int i, int i2, byte b, int i3) {
        switch (i2) {
            case 0:
                return i != 0;
            case 1:
                return i3 >= 10;
            case 2:
                return i3 >= 4;
            case 3:
                return b == 0 && i3 == 8;
            case 4:
                return i3 >= 4;
            case 5:
            default:
                return true;
            case 6:
                return i3 == 4;
            case 7:
                return i3 == 8;
            case 8:
                return i3 >= 4;
            case 9:
                return i3 == 8;
        }
    }

    public SpdyFrameDecoder(SpdyVersion spdyVersion, SpdyFrameDecoderDelegate spdyFrameDecoderDelegate) {
        this(spdyVersion, spdyFrameDecoderDelegate, 8192);
    }

    public SpdyFrameDecoder(SpdyVersion spdyVersion, SpdyFrameDecoderDelegate spdyFrameDecoderDelegate, int i) {
        this.spdyVersion = ((SpdyVersion) ObjectUtil.checkNotNull(spdyVersion, "spdyVersion")).getVersion();
        this.delegate = (SpdyFrameDecoderDelegate) ObjectUtil.checkNotNull(spdyFrameDecoderDelegate, "delegate");
        this.maxChunkSize = ObjectUtil.checkPositive(i, "maxChunkSize");
        this.state = State.READ_COMMON_HEADER;
    }

    /* renamed from: io.grpc.netty.shaded.io.netty.handler.codec.spdy.SpdyFrameDecoder$1  reason: invalid class name */
    /* loaded from: classes4.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State;

        static {
            int[] iArr = new int[State.values().length];
            $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State = iArr;
            try {
                iArr[State.READ_COMMON_HEADER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_DATA_FRAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_SYN_STREAM_FRAME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_SYN_REPLY_FRAME.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_RST_STREAM_FRAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_SETTINGS_FRAME.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_SETTING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_PING_FRAME.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_GOAWAY_FRAME.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_HEADERS_FRAME.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_WINDOW_UPDATE_FRAME.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.READ_HEADER_BLOCK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.DISCARD_FRAME.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[State.FRAME_ERROR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void decode(ByteBuf byteBuf) {
        int i;
        while (true) {
            int i2 = 0;
            r2 = false;
            boolean z = false;
            switch (AnonymousClass1.$SwitchMap$io$netty$handler$codec$spdy$SpdyFrameDecoder$State[this.state.ordinal()]) {
                case 1:
                    if (byteBuf.readableBytes() >= 8) {
                        int readerIndex = byteBuf.readerIndex();
                        int i3 = readerIndex + 4;
                        int i4 = readerIndex + 5;
                        byteBuf.skipBytes(8);
                        if ((byteBuf.getByte(readerIndex) & 128) != 0) {
                            i = SpdyCodecUtil.getUnsignedShort(byteBuf, readerIndex) & 32767;
                            int unsignedShort = SpdyCodecUtil.getUnsignedShort(byteBuf, readerIndex + 2);
                            this.streamId = 0;
                            i2 = unsignedShort;
                        } else {
                            i = this.spdyVersion;
                            this.streamId = SpdyCodecUtil.getUnsignedInt(byteBuf, readerIndex);
                        }
                        this.flags = byteBuf.getByte(i3);
                        int unsignedMedium = SpdyCodecUtil.getUnsignedMedium(byteBuf, i4);
                        this.length = unsignedMedium;
                        if (i != this.spdyVersion) {
                            this.state = State.FRAME_ERROR;
                            this.delegate.readFrameError("Invalid SPDY Version");
                            break;
                        } else if (!isValidFrameHeader(this.streamId, i2, this.flags, unsignedMedium)) {
                            this.state = State.FRAME_ERROR;
                            this.delegate.readFrameError("Invalid Frame Error");
                            break;
                        } else {
                            this.state = getNextState(i2, this.length);
                            break;
                        }
                    } else {
                        return;
                    }
                case 2:
                    int i5 = this.length;
                    if (i5 == 0) {
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readDataFrame(this.streamId, hasFlag(this.flags, (byte) 1), Unpooled.buffer(0));
                        break;
                    } else {
                        int min = Math.min(this.maxChunkSize, i5);
                        if (byteBuf.readableBytes() >= min) {
                            ByteBuf buffer = byteBuf.alloc().buffer(min);
                            buffer.writeBytes(byteBuf, min);
                            int i6 = this.length - min;
                            this.length = i6;
                            if (i6 == 0) {
                                this.state = State.READ_COMMON_HEADER;
                            }
                            if (this.length == 0 && hasFlag(this.flags, (byte) 1)) {
                                z = true;
                            }
                            this.delegate.readDataFrame(this.streamId, z, buffer);
                            break;
                        } else {
                            return;
                        }
                    }
                case 3:
                    if (byteBuf.readableBytes() >= 10) {
                        int readerIndex2 = byteBuf.readerIndex();
                        this.streamId = SpdyCodecUtil.getUnsignedInt(byteBuf, readerIndex2);
                        int unsignedInt = SpdyCodecUtil.getUnsignedInt(byteBuf, readerIndex2 + 4);
                        byte b = (byte) ((byteBuf.getByte(readerIndex2 + 8) >> 5) & 7);
                        boolean hasFlag = hasFlag(this.flags, (byte) 1);
                        boolean hasFlag2 = hasFlag(this.flags, (byte) 2);
                        byteBuf.skipBytes(10);
                        this.length -= 10;
                        if (this.streamId == 0) {
                            this.state = State.FRAME_ERROR;
                            this.delegate.readFrameError("Invalid SYN_STREAM Frame");
                            break;
                        } else {
                            this.state = State.READ_HEADER_BLOCK;
                            this.delegate.readSynStreamFrame(this.streamId, unsignedInt, b, hasFlag, hasFlag2);
                            break;
                        }
                    } else {
                        return;
                    }
                case 4:
                    if (byteBuf.readableBytes() >= 4) {
                        this.streamId = SpdyCodecUtil.getUnsignedInt(byteBuf, byteBuf.readerIndex());
                        boolean hasFlag3 = hasFlag(this.flags, (byte) 1);
                        byteBuf.skipBytes(4);
                        this.length -= 4;
                        if (this.streamId == 0) {
                            this.state = State.FRAME_ERROR;
                            this.delegate.readFrameError("Invalid SYN_REPLY Frame");
                            break;
                        } else {
                            this.state = State.READ_HEADER_BLOCK;
                            this.delegate.readSynReplyFrame(this.streamId, hasFlag3);
                            break;
                        }
                    } else {
                        return;
                    }
                case 5:
                    if (byteBuf.readableBytes() >= 8) {
                        this.streamId = SpdyCodecUtil.getUnsignedInt(byteBuf, byteBuf.readerIndex());
                        int signedInt = SpdyCodecUtil.getSignedInt(byteBuf, byteBuf.readerIndex() + 4);
                        byteBuf.skipBytes(8);
                        if (this.streamId == 0 || signedInt == 0) {
                            this.state = State.FRAME_ERROR;
                            this.delegate.readFrameError("Invalid RST_STREAM Frame");
                            break;
                        } else {
                            this.state = State.READ_COMMON_HEADER;
                            this.delegate.readRstStreamFrame(this.streamId, signedInt);
                            break;
                        }
                    } else {
                        return;
                    }
                case 6:
                    if (byteBuf.readableBytes() >= 4) {
                        boolean hasFlag4 = hasFlag(this.flags, (byte) 1);
                        this.numSettings = SpdyCodecUtil.getUnsignedInt(byteBuf, byteBuf.readerIndex());
                        byteBuf.skipBytes(4);
                        int i7 = this.length - 4;
                        this.length = i7;
                        if ((i7 & 7) != 0 || (i7 >> 3) != this.numSettings) {
                            this.state = State.FRAME_ERROR;
                            this.delegate.readFrameError("Invalid SETTINGS Frame");
                            break;
                        } else {
                            this.state = State.READ_SETTING;
                            this.delegate.readSettingsFrame(hasFlag4);
                            break;
                        }
                    } else {
                        return;
                    }
                case 7:
                    if (this.numSettings == 0) {
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readSettingsEnd();
                        break;
                    } else if (byteBuf.readableBytes() >= 8) {
                        byte b2 = byteBuf.getByte(byteBuf.readerIndex());
                        int unsignedMedium2 = SpdyCodecUtil.getUnsignedMedium(byteBuf, byteBuf.readerIndex() + 1);
                        int signedInt2 = SpdyCodecUtil.getSignedInt(byteBuf, byteBuf.readerIndex() + 4);
                        boolean hasFlag5 = hasFlag(b2, (byte) 1);
                        boolean hasFlag6 = hasFlag(b2, (byte) 2);
                        byteBuf.skipBytes(8);
                        this.numSettings--;
                        this.delegate.readSetting(unsignedMedium2, signedInt2, hasFlag5, hasFlag6);
                        break;
                    } else {
                        return;
                    }
                case 8:
                    if (byteBuf.readableBytes() >= 4) {
                        int signedInt3 = SpdyCodecUtil.getSignedInt(byteBuf, byteBuf.readerIndex());
                        byteBuf.skipBytes(4);
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readPingFrame(signedInt3);
                        break;
                    } else {
                        return;
                    }
                case 9:
                    if (byteBuf.readableBytes() >= 8) {
                        int unsignedInt2 = SpdyCodecUtil.getUnsignedInt(byteBuf, byteBuf.readerIndex());
                        int signedInt4 = SpdyCodecUtil.getSignedInt(byteBuf, byteBuf.readerIndex() + 4);
                        byteBuf.skipBytes(8);
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readGoAwayFrame(unsignedInt2, signedInt4);
                        break;
                    } else {
                        return;
                    }
                case 10:
                    if (byteBuf.readableBytes() >= 4) {
                        this.streamId = SpdyCodecUtil.getUnsignedInt(byteBuf, byteBuf.readerIndex());
                        boolean hasFlag7 = hasFlag(this.flags, (byte) 1);
                        byteBuf.skipBytes(4);
                        this.length -= 4;
                        if (this.streamId == 0) {
                            this.state = State.FRAME_ERROR;
                            this.delegate.readFrameError("Invalid HEADERS Frame");
                            break;
                        } else {
                            this.state = State.READ_HEADER_BLOCK;
                            this.delegate.readHeadersFrame(this.streamId, hasFlag7);
                            break;
                        }
                    } else {
                        return;
                    }
                case 11:
                    if (byteBuf.readableBytes() >= 8) {
                        this.streamId = SpdyCodecUtil.getUnsignedInt(byteBuf, byteBuf.readerIndex());
                        int unsignedInt3 = SpdyCodecUtil.getUnsignedInt(byteBuf, byteBuf.readerIndex() + 4);
                        byteBuf.skipBytes(8);
                        if (unsignedInt3 == 0) {
                            this.state = State.FRAME_ERROR;
                            this.delegate.readFrameError("Invalid WINDOW_UPDATE Frame");
                            break;
                        } else {
                            this.state = State.READ_COMMON_HEADER;
                            this.delegate.readWindowUpdateFrame(this.streamId, unsignedInt3);
                            break;
                        }
                    } else {
                        return;
                    }
                case 12:
                    if (this.length == 0) {
                        this.state = State.READ_COMMON_HEADER;
                        this.delegate.readHeaderBlockEnd();
                        break;
                    } else if (byteBuf.isReadable()) {
                        int min2 = Math.min(byteBuf.readableBytes(), this.length);
                        ByteBuf buffer2 = byteBuf.alloc().buffer(min2);
                        buffer2.writeBytes(byteBuf, min2);
                        this.length -= min2;
                        this.delegate.readHeaderBlock(buffer2);
                        break;
                    } else {
                        return;
                    }
                case 13:
                    int min3 = Math.min(byteBuf.readableBytes(), this.length);
                    byteBuf.skipBytes(min3);
                    int i8 = this.length - min3;
                    this.length = i8;
                    if (i8 == 0) {
                        this.state = State.READ_COMMON_HEADER;
                        break;
                    } else {
                        return;
                    }
                case 14:
                    byteBuf.skipBytes(byteBuf.readableBytes());
                    return;
                default:
                    throw new Error("Shouldn't reach here.");
            }
        }
    }

    private static State getNextState(int i, int i2) {
        switch (i) {
            case 0:
                return State.READ_DATA_FRAME;
            case 1:
                return State.READ_SYN_STREAM_FRAME;
            case 2:
                return State.READ_SYN_REPLY_FRAME;
            case 3:
                return State.READ_RST_STREAM_FRAME;
            case 4:
                return State.READ_SETTINGS_FRAME;
            case 5:
            default:
                if (i2 != 0) {
                    return State.DISCARD_FRAME;
                }
                return State.READ_COMMON_HEADER;
            case 6:
                return State.READ_PING_FRAME;
            case 7:
                return State.READ_GOAWAY_FRAME;
            case 8:
                return State.READ_HEADERS_FRAME;
            case 9:
                return State.READ_WINDOW_UPDATE_FRAME;
        }
    }
}
