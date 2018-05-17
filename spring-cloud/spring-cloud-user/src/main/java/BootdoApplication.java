


@EnableTransactionManagement
@ServletComponentScan
@MapperScan("com.home.*.dao")
@SpringBootApplication
public class BootdoApplication {
    public static void main(String[] args) {
        SpringApplication.run(BootdoApplication.class, args);
        System.out.println("ヾ(◍°∇°◍)ﾉﾞ    home启动成功      ヾ(◍°∇°◍)ﾉﾞ\n");
    }

}
