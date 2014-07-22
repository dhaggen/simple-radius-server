package se.simple.radius;

public enum PacketCode {
    ACCESS_REQUEST(1), ACCESS_ACCEPT(2), ACCESS_REJECT(3), ACCESS_CHALLENGE(11);
    public final int code;

    private PacketCode(int i) {
        this.code = i;
    }

    public static PacketCode intToCode(int i) {
        for(PacketCode code : PacketCode.values()) {
            if(code.code == i)
                return code;
        }
        throw new IllegalArgumentException("Invalid code for RadiusPacket");
    }
}