
@SpringBootApplication
public class SpringAnnotationPracticeApplication {

    public static void main(String[] args) {

        ApplicationContext context =
                SpringApplication.run(
                        SpringAnnotationPracticeApplication.class,
                        args
                );

        System.out.println("Application Started");

        System.out.println("Before getting ReportService");

        ReportService reportService =
                context.getBean(ReportService.class);

        System.out.println("After getting ReportService");

        reportService.generateReport();
    }
}