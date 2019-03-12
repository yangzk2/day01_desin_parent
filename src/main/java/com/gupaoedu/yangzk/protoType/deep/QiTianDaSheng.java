package com.gupaoedu.yangzk.protoType.deep;

import java.io.*;
import java.util.Date;

/**
 * 深克隆
 */
public class QiTianDaSheng extends Monkey implements Cloneable, Serializable {

    private JinGuBang jinGuBang;

    public JinGuBang getJinGuBang() {
        return jinGuBang;
    }

    public void setJinGuBang(JinGuBang jinGuBang) {
        this.jinGuBang = jinGuBang;
    }

    public QiTianDaSheng(){
        this.jinGuBang = new JinGuBang();
        this.setBirthday(new Date());
    }

    @Override
    public Object clone() {
        return this.DeepClone();
    }

    public Object DeepClone(){
        try {
            //通过字节流序列化读取当前对象
            ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
            ObjectOutputStream  objectOutputStream = new ObjectOutputStream(outputStream);
            objectOutputStream.writeObject(this);
            //在通过字节流输入写入输出的字节流对象
            ByteArrayInputStream arrayInputStream = new ByteArrayInputStream(outputStream.toByteArray());

            ObjectInputStream objectInputStream = new ObjectInputStream(arrayInputStream);
            QiTianDaSheng copy = (QiTianDaSheng)objectInputStream.readObject();
            copy.setJinGuBang(new JinGuBang());
            return copy;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public QiTianDaSheng shallowClone(QiTianDaSheng target){

        QiTianDaSheng qiTianDaSheng = new QiTianDaSheng();
        qiTianDaSheng.setName(target.getName());
        qiTianDaSheng.setAge(target.getAge());
        qiTianDaSheng.jinGuBang = target.jinGuBang;
        qiTianDaSheng.setBirthday(new Date());
        return  qiTianDaSheng;
    }
}
