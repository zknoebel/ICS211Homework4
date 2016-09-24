/**
 * 
 */

/**
 * Simple Contact class.
 * 
 * @author Cam Moore
 *
 */
public class Contact {

  private String firstName;
  private String lastName;
  private String company;
  private String mobile;
  private String home;
  private String work;
  private String email;


  /**
   * Creates a new Contact.
   * 
   * @param firstName the first name.
   * @param lastName the last name.
   * @param company the company.
   * @param mobile the mobile phone number.
   * @param home the home phone number.
   * @param work the work phone number.
   * @param email the email address.
   */
  public Contact(String firstName, String lastName, String company, String mobile, String home, String work,
      String email) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.company = company;
    this.mobile = mobile;
    this.home = home;
    this.work = work;
    this.email = email;
  }


  /**
   * Gets the firstName property.
   * 
   * @return the firstName
   */
  public String getFirstName() {
    return firstName;
  }


  /**
   * Sets the firstName property.
   * 
   * @param firstName the firstName to set
   */
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  /**
   * Gets the lastName property.
   * 
   * @return the lastName
   */
  public String getLastName() {
    return lastName;
  }


  /**
   * Sets the lastName property.
   * 
   * @param lastName the lastName to set
   */
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  /**
   * Gets the company property.
   * 
   * @return the company
   */
  public String getCompany() {
    return company;
  }


  /**
   * Sets the company property.
   * 
   * @param company the company to set
   */
  public void setCompany(String company) {
    this.company = company;
  }


  /**
   * Gets the mobile property.
   * 
   * @return the mobile
   */
  public String getMobile() {
    return mobile;
  }


  /**
   * Sets the mobile property.
   * 
   * @param mobile the mobile to set
   */
  public void setMobile(String mobile) {
    this.mobile = mobile;
  }


  /**
   * Gets the home property.
   * 
   * @return the home
   */
  public String getHome() {
    return home;
  }


  /**
   * Sets the home property.
   * 
   * @param home the home to set
   */
  public void setHome(String home) {
    this.home = home;
  }


  /**
   * Gets the work property.
   * 
   * @return the work
   */
  public String getWork() {
    return work;
  }


  /**
   * Sets the work property.
   * 
   * @param work the work to set
   */
  public void setWork(String work) {
    this.work = work;
  }


  /**
   * Gets the email property.
   * 
   * @return the email
   */
  public String getEmail() {
    return email;
  }


  /**
   * Sets the email property.
   * 
   * @param email the email to set
   */
  public void setEmail(String email) {
    this.email = email;
  }


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#hashCode()
   */
  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((company == null) ? 0 : company.hashCode());
    result = prime * result + ((email == null) ? 0 : email.hashCode());
    result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
    result = prime * result + ((home == null) ? 0 : home.hashCode());
    result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
    result = prime * result + ((mobile == null) ? 0 : mobile.hashCode());
    result = prime * result + ((work == null) ? 0 : work.hashCode());
    return result;
  }


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#equals(java.lang.Object)
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    Contact other = (Contact) obj;
    if (company == null) {
      if (other.company != null) {
        return false;
      }
    }
    else if (!company.equals(other.company)) {
      return false;
    }
    if (email == null) {
      if (other.email != null) {
        return false;
      }
    }
    else if (!email.equals(other.email)) {
      return false;
    }
    if (firstName == null) {
      if (other.firstName != null) {
        return false;
      }
    }
    else if (!firstName.equals(other.firstName)) {
      return false;
    }
    if (home == null) {
      if (other.home != null) {
        return false;
      }
    }
    else if (!home.equals(other.home)) {
      return false;
    }
    if (lastName == null) {
      if (other.lastName != null) {
        return false;
      }
    }
    else if (!lastName.equals(other.lastName)) {
      return false;
    }
    if (mobile == null) {
      if (other.mobile != null) {
        return false;
      }
    }
    else if (!mobile.equals(other.mobile)) {
      return false;
    }
    if (work == null) {
      if (other.work != null) {
        return false;
      }
    }
    else if (!work.equals(other.work)) {
      return false;
    }
    return true;
  }


  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "Contact [firstName= " + firstName + ", lastName= " + lastName + "]";
  }

}
