package ashokIT.__SpringBoot_Autowiring.SERVICE;


import ashokIT.__SpringBoot_Autowiring.DAO.ReportDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class ReportService {
    private ReportDao reportDao;

//    @Autowired
//    public void setReportDao(ReportDao reportDao) {
//        System.out.println("setReportDao method called");
//        this.reportDao = reportDao;
//    }

    @Autowired
    public ReportService(ReportDao reportDao) {
        System.out.println("Report Service :: parameterized Constructor called.....");
        this.reportDao = reportDao;
    }
    public ReportService(){
        System.out.println("Report Service :: 0 param Constructor called.....");
    }

    public void generateReport(){
         reportDao.findData();
        System.out.println("Generating report........");
    }

}
