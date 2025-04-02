package com.humber.Week11SpringProfiles.configs;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration // このクラス���Springの設定クラスであることを示します
@Profile("default") // このクラスが「default」プロファイルでのみ有効であることを示します
public class DefaultConfig implements DBConfig {

    @Override
    public void setupDBConnection() {
        // default connect DB: デフォルトのデータベース接続を設定するメソッド
        System.out.println("Setting up default database connection");
    }
}
