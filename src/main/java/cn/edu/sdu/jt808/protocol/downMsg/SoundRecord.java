package cn.edu.sdu.jt808.protocol.downMsg;

import cn.edu.sdu.jt808.commons.MessageId;
import cn.edu.sdu.jt808.protocol.Header;
import cn.edu.sdu.jt808.jtframework.annotation.MsgType;
import cn.edu.sdu.jt808.jtframework.annotation.Property;
import cn.edu.sdu.jt808.jtframework.commons.DataType;
import cn.edu.sdu.jt808.jtframework.message.PackageData;

@MsgType(MessageId.cmd_record_start)
public class SoundRecord extends PackageData<Header> {

    private Integer command;
    private Integer parameter;
    private Integer saveSign;
    private Integer audioSampleRate;

    public SoundRecord() {
    }

    /** 0：停止录音；0x01：开始录音 */
    @Property(index = 0, type = DataType.BYTE, desc = "录音命令")
    public Integer getCommand() {
        return command;
    }

    public void setCommand(Integer command) {
        this.command = command;
    }

    @Property(index = 1, type = DataType.WORD, desc = "单位为秒（s），0 表示一直录音")
    public Integer getParameter() {
        return parameter;
    }

    public void setParameter(Integer parameter) {
        this.parameter = parameter;
    }

    /** 0：实时上传；1：保存 */
    @Property(index = 3, type = DataType.BYTE, desc = "保存标志")
    public Integer getSaveSign() {
        return saveSign;
    }

    public void setSaveSign(Integer saveSign) {
        this.saveSign = saveSign;
    }

    /**
     * 0：8K；
     * 1：11K；
     * 2：23K；
     * 3：32K；
     * 其他保留
     */
    @Property(index = 4, type = DataType.BYTE, desc = "音频采样率")
    public Integer getAudioSampleRate() {
        return audioSampleRate;
    }

    public void setAudioSampleRate(Integer audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }
}