/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpid
 */

public class system {
    private static system s;
    private DonorDirectory donordirectory;
    private ReceiverDirectory receiverdirectory;
    private HospitalDirectory hospitaldirectory;
    private HotelDirectory hoteldirectory;   
    private CentreDirectory centredirectory;
    private PharmacyDirectory pharmacydirectory;    
    private FAQDirectory faqdirectory;   
    private NotificationDirectory notificationdirectory;    
    private PatientDirectory emergencydirectory;    
    private PatientDirectory patientdirectory;     
    private BloodDonationEventDirectory blooddonationeventdirectory;
    private DonorSlotDirectory  donorslotdirectory;    
    private ReceiverSlotDirectory receiverslotdirectory;    
    private ApplicantDirectory applicantdirectory;   
    private AcceptDirectory acceptdirectory;    
    private RejectDirectory rejectdirectory;   
    private DoctorDirectory doctordirectory;    
    private BloodBankDirectory bloodbankdirectory;    
    private FundDirectory funddirectory;    
    private InventoryDirectory inventorydirectory;
    private static system data;
    private PharmacyOrdersDirectory pharmacyordersdirectory;
     
    

    
    
    
    public system()
    {
        donordirectory = new DonorDirectory();
        receiverdirectory = new ReceiverDirectory();
        hospitaldirectory = new HospitalDirectory();
        hoteldirectory = new HotelDirectory();
        centredirectory = new CentreDirectory();
        pharmacydirectory = new PharmacyDirectory();
        faqdirectory = new FAQDirectory();
        notificationdirectory = new NotificationDirectory();
        emergencydirectory = new PatientDirectory();
        patientdirectory = new PatientDirectory();
        blooddonationeventdirectory = new BloodDonationEventDirectory();
        donorslotdirectory = new DonorSlotDirectory();
        receiverslotdirectory = new ReceiverSlotDirectory();
        applicantdirectory = new ApplicantDirectory();
        acceptdirectory = new AcceptDirectory();
        rejectdirectory = new RejectDirectory();
        doctordirectory = new DoctorDirectory();
        bloodbankdirectory = new BloodBankDirectory();
        funddirectory = new FundDirectory();
        inventorydirectory = new InventoryDirectory();
        pharmacyordersdirectory = new PharmacyOrdersDirectory();
        
    }

    public PharmacyOrdersDirectory getPharmacyordersdirectory() {
        return pharmacyordersdirectory;
    }

    public void setPharmacyordersdirectory(PharmacyOrdersDirectory pharmacyordersdirectory) {
        this.pharmacyordersdirectory = pharmacyordersdirectory;
    }
    
    
    public static system getInstance()
    {
        if(data == null){
            data = new system();
        }
        
        return data;
    }
    
    public InventoryDirectory getInventorydirectory() {
        return inventorydirectory;
    }

    public void setInventorydirectory(InventoryDirectory inventorydirectory) {
        this.inventorydirectory = inventorydirectory;
    }    
    
    public FundDirectory getFunddirectory() {
        return funddirectory;
    }

    public void setFunddirectory(FundDirectory funddirectory) {
        this.funddirectory = funddirectory;
    }
    public BloodBankDirectory getBloodbankdirectory() {
        return bloodbankdirectory;
    }

    public void setBloodbankdirectory(BloodBankDirectory bloodbankdirectory) {
        this.bloodbankdirectory = bloodbankdirectory;
    }
    
     public DoctorDirectory getDoctordirectory() {
        return doctordirectory;
    }

    public void setDoctordirectory(DoctorDirectory doctordirectory) {
        this.doctordirectory = doctordirectory;
    }
    
    public RejectDirectory getRejectdirectory() {
        return rejectdirectory;
    }

    public void setRejectdirectory(RejectDirectory rejectdirectory) {
        this.rejectdirectory = rejectdirectory;
    }
    
     public AcceptDirectory getAcceptdirectory() {
        return acceptdirectory;
    }

    public void setAcceptdirectory(AcceptDirectory acceptdirectory) {
        this.acceptdirectory = acceptdirectory;
    }
    public ApplicantDirectory getApplicantdirectory() {
        return applicantdirectory;
    }

    public void setApplicantdirectory(ApplicantDirectory applicantdirectory) {
        this.applicantdirectory = applicantdirectory;
    }
    
    public ReceiverSlotDirectory getReceiverslotdirectory() {
        return receiverslotdirectory;
    }

    public void setReceiverslotdirectory(ReceiverSlotDirectory receiverslotdirectory) {
        this.receiverslotdirectory = receiverslotdirectory;
    }
    
    public DonorSlotDirectory getDonorslotdirectory() {
        return donorslotdirectory;
    }

    public void setDonorslotdirectory(DonorSlotDirectory donorslotdirectory) {
        this.donorslotdirectory = donorslotdirectory;
    }
    
    public BloodDonationEventDirectory getBlooddonationeventdirectory() {
        return blooddonationeventdirectory;
    }

    public void setBlooddonationeventdirectory(BloodDonationEventDirectory blooddonationeventdirectory) {
        this.blooddonationeventdirectory = blooddonationeventdirectory;
    }
    
    public PatientDirectory getPatientdirectory() {
        return patientdirectory;
    }

    public void setPatientdirectory(PatientDirectory patientdirectory) {
        this.patientdirectory = patientdirectory;
    }
    
    public PatientDirectory getEmergencydirectory() {
        return emergencydirectory;
    }

    public void setEmergencydirectory(PatientDirectory emergencydirectory) {
        this.emergencydirectory = emergencydirectory;
    }
    
     public NotificationDirectory getNotificationdirectory() {
        return notificationdirectory;
    }

    public void setNotificationdirectory(NotificationDirectory notificationdirectory) {
        this.notificationdirectory = notificationdirectory;
    }
    
    public FAQDirectory getFaqdirectory() {
        return faqdirectory;
    }

    public void setFaqdirectory(FAQDirectory faqdirectory) {
        this.faqdirectory = faqdirectory;
    }
     public CentreDirectory getCentredirectory() {
        return centredirectory;
    }

    public void setCentredirectory(CentreDirectory centredirectory) {
        this.centredirectory = centredirectory;
    }

    public HotelDirectory getHoteldirectory() {
        return hoteldirectory;
    }

    public void setHoteldirectory(HotelDirectory hoteldirectory) {
        this.hoteldirectory = hoteldirectory;
    }

    public HospitalDirectory getHospitaldirectory() {
        return hospitaldirectory;
    }

    public void setHospitaldirectory(HospitalDirectory hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }  

    public ReceiverDirectory getReceiverdirectory() {
        return receiverdirectory;
    }

    public void setReceiverdirectory(ReceiverDirectory receiverdirectory) {
        this.receiverdirectory = receiverdirectory;
    }
    

    public DonorDirectory getDonordirectory() {
        return donordirectory;
    }

    public void setDonordirectory(DonorDirectory donordirectory) {
        this.donordirectory = donordirectory;
    }
    
    public PharmacyDirectory getPharmacydirectory() {
        return pharmacydirectory;
    }

    public void setPharmacydirectory(PharmacyDirectory pharmacydirectory) {
        this.pharmacydirectory = pharmacydirectory;
    }

    
   
    
    
    

    
    
    
}
